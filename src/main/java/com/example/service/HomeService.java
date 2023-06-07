package com.example.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@ApplicationScoped
public class HomeService {
    @Inject
    EntityManager em;

    public String version() {
        return (String) em.createNativeQuery("select version()").getSingleResult();
    }
}
