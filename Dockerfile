FROM openjdk:17
COPY "./target/ParcialKarent-1.jar" "app.jar"
EXPOSE 8092
ENTRYPOINT [ "java", "-jar", "app.jar" ]