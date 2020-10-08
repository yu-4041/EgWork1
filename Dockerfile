FROM java:8-jre

COPY . .

CMD ["java","-jar","target/EgWork1-1.0-SNAPSHOT.jar"]

EXPOSE 80