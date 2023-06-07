package com.example;

import io.quarkus.hibernate.orm.PersistenceUnitExtension;
import io.quarkus.hibernate.orm.runtime.tenant.TenantResolver;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import java.util.Random;

// As far as I can tell, this plumbing becomes necessary if quarkus
// detects a class that implements TenantConnectionResolver
// Also as far as I can tell, quarkus only bothers calling resolveTenantId() if
// there is an active request context. Otherwise, only getDefaultTenantId() is invoked.
@PersistenceUnitExtension
@ApplicationScoped
public class ProgrammaticResolver implements TenantResolver {

    @ConfigProperty(name = "sso.db")
    String db;

    @Override
    public String getDefaultTenantId() {
        return db;
    }

    @Override
    public String resolveTenantId() {
        return db;
    }
}