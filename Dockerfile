FROM openjdk:11-jre-slim

WORKDIR /myAp

COPY target/crudProducts-0.0.1-SNAPSHOT.jar myAp.jar
#exponer puerto
EXPOSE 8080

#entorno variables mysql
ENV DB_HOST=mysql \
    DB_PORT=3306 \
    DB_DATABASE=test \
    DB_USERNAME=root \
    DB_PASSWORD=

#comando ejecucion
CMD ["java", "-jar", "myAp.jar"]


