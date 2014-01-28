package com.morcinek.server.webservice.resources;


import com.google.inject.Singleton;
import com.morcinek.server.database.AuthorManager;
import com.morcinek.server.model.Author;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
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

    @Inject
    private AuthorManager authorManager;

    @GET
    @Path("/authors")
    public Response getAuthors() {
        return Response.status(Response.Status.OK).entity(authorManager.getAllAuthors()).build();
    }

    @GET
    @Path("/date")
    public Response getSystemDate() {
        return Response.status(Response.Status.OK).entity(new Date()).build();
    }

}
