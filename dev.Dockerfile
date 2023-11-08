FROM openjdk:19
WORKDIR /app
COPY /api-expense-track.jar api-expense-track.jar
EXPOSE 8083
CMD ["java", "-jar", "api-expense-track.jar"]
