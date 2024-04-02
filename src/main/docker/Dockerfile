FROM java:8
VOLUME /tmp
ADD Code-U12-0.0.1-SNAPSHOT.jar Code-U12.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Xms128m","-Xmx128m","-jar","/app.jar","--spring.profiles.active=dev","-c"]