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
package org.apache.camel.rest.resources;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.view.Viewable;
import com.sun.jersey.spi.inject.Inject;
import com.sun.jersey.spi.resource.Singleton;

import org.apache.camel.CamelContext;
import org.apache.camel.Endpoint;
import org.apache.camel.model.RouteType;
import org.apache.camel.model.RoutesType;
import org.apache.camel.rest.model.Camel;
import org.apache.camel.rest.model.EndpointLink;
import org.apache.camel.rest.model.Endpoints;


/**
 * The resource for the CamelContext
 *
 * @version $Revision$
 */
@Path("/")
@Singleton
public class CamelContextResource extends ResourceSupport {

    private final CamelContext camelContext;

    public CamelContextResource(@Inject CamelContext camelContext) {
        this.camelContext = camelContext;
    }

    public CamelContext getCamelContext() {
        return camelContext;
    }

    public String getName() {
        return camelContext.getName();
    }

    // TODO remove redunant non-DRY code ASAP
    //
    // The following redundant methods are here
    // until there is a way to specify a higher priority for HTML views
    //
    // for more details see these issues
    //
    // https://jsr311.dev.java.net/issues/show_bug.cgi?id=65
    // https://jsr311.dev.java.net/issues/show_bug.cgi?id=46
    
    @GET
    @Path("endpoints")
    @Produces({MediaType.TEXT_HTML})
    public Viewable endpoints() {
        return view("endpoints");
    }

    @GET
    @Path("routes")
    @Produces({MediaType.TEXT_HTML})
    public Viewable routesView() {
        return view("routes");
    }

    // XML / JSON representations
    //-------------------------------------------------------------------------

    @GET
    @Produces({MediaType.TEXT_XML, MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Camel getCamel() {
        return new Camel(camelContext);
    }


    /**
     * Returns a list of endpoints available in this context
     *
     * @return
     */
    @GET
    @Path("endpoints")
    @Produces({"application/xml", "application/json"})
    public Endpoints getEndpointsDTO() {
        return new Endpoints(camelContext);
    }

    public List<EndpointLink> getEndpoints() {
        return getEndpointsDTO().getEndpoints();
    }

    /**
     * Looks up an individual endpoint
     */
    @Path("endpoint/{id}")
    public EndpointResource getEndpoint(@PathParam("id") String id) {
        // TODO lets assume the ID is the endpoint
        Endpoint endpoint = getCamelContext().getEndpoint(id);
        if (endpoint != null) {
            return new EndpointResource(endpoint);
        } else {
            return null;
        }
    }

    /**
     * Returns the routes currently active within this context
     *
     * @return
     */
    @GET
    @Path("routes")
    @Produces({"application/xml", "application/json"})
    public RoutesType getRouteDefinitions() {
        RoutesType answer = new RoutesType();
        if (camelContext != null) {
            List<RouteType> list = camelContext.getRouteDefinitions();
            answer.setRoutes(list);
        }
        return answer;
    }

    // Properties
    //-------------------------------------------------------------------------
    public List<RouteType> getRoutes() {
        return getRouteDefinitions().getRoutes();
    }



}
