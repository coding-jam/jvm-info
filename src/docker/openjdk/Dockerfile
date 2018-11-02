FROM openjdk:11.0.1-jre-slim-sid

ENV JAVA_OPTS -Xmx256m

ADD /maven/jvm-info-0.0.1-SNAPSHOT.jar /app/
CMD java $JAVA_OPTS -jar /app/jvm-info-0.0.1-SNAPSHOT.jar