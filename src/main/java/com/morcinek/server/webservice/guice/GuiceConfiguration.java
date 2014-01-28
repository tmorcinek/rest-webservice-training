package com.morcinek.server.webservice.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.morcinek.server.webservice.guice.modules.CoreModule;
import com.morcinek.server.webservice.guice.modules.WebserviceModule;

/**
 * Created with IntelliJ IDEA.
 * By Tomasz Morcinek in 2014.
 */
public class GuiceConfiguration extends GuiceServletContextListener {
    @Override
    protected Injector getInjector() {
        return Guice.createInjector(new CoreModule(), new WebserviceModule());
    }
}
