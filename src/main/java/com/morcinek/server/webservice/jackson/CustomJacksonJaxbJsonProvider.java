package com.morcinek.server.webservice.jackson;

import org.codehaus.jackson.jaxrs.Annotations;
import org.codehaus.jackson.jaxrs.JacksonJaxbJsonProvider;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

/**
 * Created with IntelliJ IDEA.
 * By Tomasz Morcinek in 2014.
 */
@Provider
public class CustomJacksonJaxbJsonProvider extends JacksonJaxbJsonProvider {

    public CustomJacksonJaxbJsonProvider() {
        super();    //To change body of overridden methods use File | Settings | File Templates.
    }

    public CustomJacksonJaxbJsonProvider(Annotations... annotationsToUse) {
        super(annotationsToUse);    //To change body of overridden methods use File | Settings | File Templates.
    }

    public CustomJacksonJaxbJsonProvider(ObjectMapper mapper, Annotations[] annotationsToUse) {
        super(mapper, annotationsToUse);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public ObjectMapper locateMapper(Class<?> type, MediaType mediaType) {
        ObjectMapper mapper = super.locateMapper(type, mediaType);
        mapper.configure(SerializationConfig.Feature.WRITE_DATES_AS_TIMESTAMPS, false);
        return mapper;
    }
}