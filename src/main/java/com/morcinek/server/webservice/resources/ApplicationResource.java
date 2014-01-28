package com.morcinek.server.webservice.resources;


import com.morcinek.server.model.Author;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * By Tomasz Morcinek in 2014.
 */
@Path("/service")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class ApplicationResource {

    private List<Author> authors = new ArrayList<Author>();

    public ApplicationResource() {
        authors.add(new Author("Tomasz", "Morcinek", "tomasz.morcinek@gmail.com", "tmorcinek.wordpress.com"));
    }

    @GET
    @Path("/authors")
    public Response getAuthors() {
        return Response.status(Response.Status.OK).entity(authors).build();
    }

    @GET
    @Path("/date")
    public Response getSystemDate() {
        return Response.status(Response.Status.OK).entity(new Date()).build();
    }

}
