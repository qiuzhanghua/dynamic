package com.example.web;

import com.example.service.HomeService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class HomeResources {
    @Inject
    HomeService homeService;
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return homeService.version();
    }
}
