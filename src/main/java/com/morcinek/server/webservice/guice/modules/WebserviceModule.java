package com.morcinek.server.webservice.guice.modules;

import com.google.inject.servlet.ServletModule;
import com.morcinek.server.webservice.jackson.CustomJacksonJaxbJsonProvider;
import com.morcinek.server.webservice.resources.ApplicationResource;
//import com.morcinek.server.webservice.resources.UserResource;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;
import org.codehaus.jackson.jaxrs.JacksonJaxbJsonProvider;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * By Tomasz Morcinek in 2014.
 */
public class WebserviceModule extends ServletModule {

    @Override
    protected void configureServlets() {
        bindRestResources();

        bind(JacksonJaxbJsonProvider.class).to(CustomJacksonJaxbJsonProvider.class).asEagerSingleton();

        Map<String, String> params = new HashMap<String, String>();
        params.put("com.sun.jersey.api.json.POJOMappingFeature", "true");
        serve("/*").with(GuiceContainer.class, params);
    }

    /**
     * bind the REST resources
     */
    protected void bindRestResources() {
        bind(ApplicationResource.class);
    }

}