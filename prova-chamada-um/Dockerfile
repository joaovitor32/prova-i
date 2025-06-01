FROM maven:3.9.4-eclipse-temurin-17 AS build


# Definir diretório de trabalho dentro do container
WORKDIR /app

# Copiar arquivos do projeto para dentro do container
COPY pom.xml .
COPY src ./src

# Rodar o build do Maven (compilar e empacotar)
RUN mvn clean package -DskipTests

# Segunda etapa: imagem para rodar o .jar gerado
FROM openjdk:17-jdk-slim

WORKDIR /app

# Copiar o .jar da etapa de build para esta imagem menor
COPY --from=build /app/target/*.jar app.jar

# Expor a porta padrão da aplicação (exemplo: 8080)
EXPOSE 8080

# Comando para rodar o jar
ENTRYPOINT ["java", "-jar", "app.jar"]