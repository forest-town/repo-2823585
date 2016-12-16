/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.openstack.cinder;

import java.util.UUID;

import org.apache.camel.component.openstack.cinder.producer.SnapshotProducer;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.openstack4j.api.Builders;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.storage.block.VolumeSnapshot;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class VolumeSnapshotProducerTest extends CinderProducerTestSupport {

    @Mock
    private VolumeSnapshot testOSVolumeSnapshot;

    private VolumeSnapshot dummyVolumeSnapshot;

    @Before
    public void setUp() {
        producer = new SnapshotProducer(endpoint, client);

        when(snapshotService.create(Matchers.any(VolumeSnapshot.class))).thenReturn(testOSVolumeSnapshot);
        when(snapshotService.get(Matchers.anyString())).thenReturn(testOSVolumeSnapshot);

        dummyVolumeSnapshot = createTestVolume();
        when(testOSVolumeSnapshot.getId()).thenReturn(UUID.randomUUID().toString());
        when(testOSVolumeSnapshot.getName()).thenReturn(dummyVolumeSnapshot.getName());
        when(testOSVolumeSnapshot.getDescription()).thenReturn(dummyVolumeSnapshot.getDescription());
        when(testOSVolumeSnapshot.getVolumeId()).thenReturn(dummyVolumeSnapshot.getVolumeId());
    }

    @Test
    public void createVolumeTest() throws Exception {
        when(endpoint.getOperation()).thenReturn(CinderConstants.CREATE);
        msg.setBody(dummyVolumeSnapshot);
        producer.process(exchange);
        final VolumeSnapshot result = msg.getBody(VolumeSnapshot.class);
        assertEqualsVolumeSnapshots(dummyVolumeSnapshot, result);
        assertNotNull(result.getId());
    }

    @Test
    public void updateVolumeSnapshotTest() throws Exception {
        when(snapshotService.update(anyString(), anyString(), anyString())).thenReturn(ActionResponse.actionSuccess());
        msg.setHeader(CinderConstants.OPERATION, CinderConstants.UPDATE);
        final String id = "id";
        final String desc = "newDesc";
        final String name = "newName";
        msg.setHeader(CinderConstants.ID, id);
        msg.setHeader(CinderConstants.DESCRIPTION, desc);
        msg.setHeader(CinderConstants.NAME, name);

        producer.process(exchange);

        ArgumentCaptor<String> idCaptor = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<String> nameCaptor = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<String> descCaptor = ArgumentCaptor.forClass(String.class);
        verify(snapshotService).update(idCaptor.capture(), nameCaptor.capture(), descCaptor.capture());

        assertEquals(id, idCaptor.getValue());
        assertEquals(name, nameCaptor.getValue());
        assertEquals(desc, descCaptor.getValue());
        assertFalse(msg.isFault());
        assertNull(msg.getBody());
    }


    @Test
    public void getVolumeSnapshotTest() throws Exception {
        when(endpoint.getOperation()).thenReturn(CinderConstants.GET);
        msg.setHeader(CinderConstants.ID, "anyID");
        producer.process(exchange);

        assertEqualsVolumeSnapshots(dummyVolumeSnapshot, msg.getBody(VolumeSnapshot.class));
    }

    @Test
    public void deleteVolumeSnapshotTest() throws Exception {
        msg.setHeader(CinderConstants.OPERATION, CinderConstants.DELETE);
        when(snapshotService.delete(anyString())).thenReturn(ActionResponse.actionSuccess());
        final String id = "id";
        msg.setHeader(CinderConstants.ID, id);

        producer.process(exchange);

        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        verify(snapshotService).delete(captor.capture());
        assertEquals(id, captor.getValue());
        assertFalse(msg.isFault());
    }

    private void assertEqualsVolumeSnapshots(VolumeSnapshot old, VolumeSnapshot newVolumeSn) {
        assertEquals(old.getName(), newVolumeSn.getName());
        assertEquals(old.getDescription(), newVolumeSn.getDescription());
        assertEquals(old.getVolumeId(), newVolumeSn.getVolumeId());
    }

    private VolumeSnapshot createTestVolume() {
        return Builders.volumeSnapshot()
                .description("descr")
                .name("name")
                .volume("volId")
                .build();
    }
}
