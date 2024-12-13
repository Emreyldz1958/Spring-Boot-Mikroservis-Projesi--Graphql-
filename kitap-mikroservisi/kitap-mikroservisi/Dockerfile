FROM openjdk:17-jdk-alpine

# Jar dosyasını Docker imajına kopyalıyoruz
COPY target/*.jar app.jar


# Uygulamayı çalıştırmak için entrypoint komutu
ENTRYPOINT ["java", "-jar", "/app.jar"]
