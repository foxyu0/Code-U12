FROM adoptopenjdk:8-jre-hotspot-arm64

VOLUME /tmp
ADD target/code-u12.jar app.jar
EXPOSE 4561
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java", "-Xms128m", "-Xmx128m", "-jar", "/app.jar", "--spring.profiles.active=dev", "-c"]
