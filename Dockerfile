FROM eclipse-temurin:17-jdk-alpine AS build
WORKDIR /app
COPY *.java ./
RUN javac -d out *.java

FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=build /app/out .
CMD ["java", "Main"]
