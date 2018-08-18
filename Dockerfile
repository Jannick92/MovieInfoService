FROM openjdk:8-jdk-alpine
RUN apk update && apk upgrade && apk add netcat-openbsd
RUN mkdir -p /usr/local/MovieInfoService
ADD FilmService-0.0.1-SNAPSHOT.jar /usr/local/MovieInfoService/
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh
#!/bin/sh
java -jar /usr/local/myservice/my-service-0.0.1-SNAPSHOT.jar