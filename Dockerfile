FROM eclipse-temurin:21-jdk
EXPOSE 8082
ADD target/Cluster_Deploy.jar k8s-deploy.jar
ENTRYPOINT ["java", "-jar", "k8s-deploy.jar"]
