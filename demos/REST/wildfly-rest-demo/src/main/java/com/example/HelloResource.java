package com.example;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/hello")
public class HelloResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response get() {
        return Response.ok("{\"method\":\"GET\",\"message\":\"Hello from GET!\"}").build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response post(String body) {
        return Response.ok("{\"method\":\"POST\",\"message\":\"Data received\"}").build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response put(String body) {
        return Response.ok("{\"method\":\"PUT\",\"message\":\"Resource updated\"}").build();
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete() {
        return Response.ok("{\"method\":\"DELETE\",\"message\":\"Resource deleted\"}").build();
    }
}
