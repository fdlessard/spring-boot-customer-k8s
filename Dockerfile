FROM bellsoft/liberica-openjre-alpine:17.0.2
COPY build/libs/spring-boot-customer-k8s-0.0.1-SNAPSHOT.jar spring-boot-customer-k8s-0.0.1.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","/spring-boot-customer-k8s-0.0.1.jar"]

