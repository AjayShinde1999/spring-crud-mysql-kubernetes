FROM openjdk:8

ADD target/spring-crud-mysql-kubernetes.jar spring-crud-mysql-kubernetes.jar

ENTRYPOINT ["java","-jar","/spring-crud-mysql-kubernetes.jar"]

