package com.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getHello() {
        return "{\"method\": \"GET\", \"message\": \"Hello from GlassFish!\"}";
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String postHello(String data) {
        return "{\"method\": \"POST\", \"received\": " + data + ", \"message\": \"Data received via POST\"}";
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String putHello(String data) {
        return "{\"method\": \"PUT\", \"received\": " + data + ", \"message\": \"Resource updated\"}";
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public String deleteHello() {
        return "{\"method\": \"DELETE\", \"message\": \"Resource deleted\"}";
    }
}
