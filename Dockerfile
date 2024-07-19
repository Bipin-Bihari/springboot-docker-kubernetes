FROM openjdk:17-oracle
EXPOSE 8085
ADD target/k8s-demo.jar k8s-demo.jar
ENTRYPOINT ["java","-jar","/k8s-demo.jar"]