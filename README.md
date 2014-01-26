rest-webservice-training
========================

Quick tutorial, example project, on how to quickly create a Java Rest Webservice. It uses the following technologies: 
- **JAX-RS (Jersey)**
- **Guice (IoC container)**
- **Jetty (Java-based HTTP (Web) server and Java Servlet container)**
- **Persistance - JPA 2.0 (EclipseLink)**
- **SQlite database**

--------------

### Other

Project also uses, maven and git. You can easily run and debug sever. Project contains **Main.class**, and you can run it as any other program. Starting project starts **jetty server**. You can also create **war** file which can be deployed on other java server. 

### Running server

If you run server in IDE using **Main.class**. You can check its resources under: `http://localhost:8080/api/`

E.g.:
- `http://localhost:8080/api/service/authors`
- `http://localhost:8080/api/service/date`
