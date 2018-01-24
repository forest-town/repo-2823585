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
package org.wordpress4j.service.impl;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.Matchers.emptyCollectionOf;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.wordpress4j.model.Content;
import org.wordpress4j.model.Format;
import org.wordpress4j.model.Post;
import org.wordpress4j.model.PostSearchCriteria;
import org.wordpress4j.service.WordpressServicePosts;
import org.wordpress4j.test.WordpressMockServerTestSupport;

public class WordpressServicePostsAdapterTest extends WordpressMockServerTestSupport {

    private static WordpressServicePosts servicePosts;

    @BeforeClass
    public static void before() {
        servicePosts = serviceProvider.getService(WordpressServicePosts.class);
    }

    @Test
    public void testRetrievePost() {
        final Post post = servicePosts.retrieve(1);
        assertThat(post, not(nullValue()));
        assertThat(post.getId(), is(greaterThan(0)));
    }

    @Test
    public void testCreatePost() {
        final Post entity = new Post();
        entity.setAuthor(2);
        entity.setTitle(new Content("hello from postman 2"));
        entity.setContent(new Content("hello world 2"));
        entity.setFormat(Format.standard);
        final Post post = servicePosts.create(entity);
        assertThat(post, not(nullValue()));
        assertThat(post.getId(), is(9));
    }

    @Test
    public void testListPosts() {
        final PostSearchCriteria criteria = new PostSearchCriteria();
        criteria.setPage(1);
        criteria.setPerPage(10);
        final List<Post> posts = servicePosts.list(criteria);
        assertThat(posts, is(not(emptyCollectionOf(Post.class))));
        assertThat(posts.size(), is(10));
    }
}
