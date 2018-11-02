# JVM 8 and Docker

**JVM 1.8u181** info inside Docker container

# Prerequirements

* Maven
* Docker

# Build

Create jar and Docker images

```
mvn clean install
```

This will produce Spring Boot application with a singe REST enpoint `/jvm`, showing JVM and environment info

Produced images are:
 * `cnj/openjdk-jvm-info`: image based on [`openjdk:8u181-jdk-slim-stretch`](https://hub.docker.com/_/openjdk/)
 * `cnj/fabric8-jvm-info`: image based on [`fabric8/java-centos-openjdk8-jdk`](https://hub.docker.com/r/fabric8/java-centos-openjdk8-jdk/)
 
 Why 2 images? In order to **compare** how fabric8 overcome limitations of JVM 8 inside Docker.
 
 # Run
 
 This project use Docker stacks. Enter Swarm mode
 
 ```
 docker swarm init
 ```
 
 Then run OpenJDK
 
 ```
 docker stack deploy -c src/docker/openjdk/stack.yml openjkd-jvm
 ```
 And go to [http://localhost:8080/jvm](http://localhost:8080/jvm)
 
 Compare what declared in `src/docker/openjdk/stack.yml` with result of `http://localhost:8080/jvm`: number of core will never match due to a [bug](https://github.com/eclipse/openj9/issues/1166) fixed in version 10
 
 
 For Fabric8 version
 
 ```
 docker stack deploy -c src/docker/openjdk/stack.yml openjkd-jvm
 ```
 And go to [http://localhost:8081/jvm](http://localhost:8081/jvm)
