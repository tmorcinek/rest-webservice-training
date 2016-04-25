rest-webservice-training
========================


Description
-------

Quick tutorial, example project, on how to quickly create a Java Rest Webservice. It uses the following technologies: 
- **JAX-RS (Jersey)**
- **Guice (IoC container)**
- **Jetty (Java-based HTTP (Web) server and Java Servlet container)**
- **Persistance - JPA 2.0 (EclipseLink)**
- **SQlite database**


Other
--------

Project also uses, maven and git. You can easily run and debug sever. Project contains **Main.class**, and you can run it as any other program. Starting project starts **jetty server**. You can also create **war** file which can be deployed on other java server. 


Running server
--------

If you run server in IDE using **Main.class**. You can check its resources under: `http://localhost:8080/api/`

E.g.:
- `http://localhost:8080/api/service/authors`
- `http://localhost:8080/api/service/date`


Developed By
--------

Tomasz Morcinek - http://morcinek.co.uk

<a href="https://plus.google.com/+TomaszMorcinek">
  <img alt="Follow me on Google+"
       src="https://dl.dropboxusercontent.com/u/86831510/google-plus-logo.png" />
</a>
<a href="https://www.linkedin.com/in/tmorcinek">
  <img alt="Follow me on LinkedIn"
       src="https://dl.dropboxusercontent.com/u/86831510/linkedin-logo.png" />
</a>
<a href="https://play.google.com/store/apps/developer?id=Tomasz+Morcinek">
  <img alt="Checkout my Applications in Google Play"
       src="https://dl.dropboxusercontent.com/u/86831510/google-play-logo.png" />
</a>


License
-------

    Copyright 2014 Tomasz Morcinek.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
