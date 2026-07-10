# FROM java:slim
# WORKDIR /app
# COPY . /app
# CMD [ "java" , "one.java"]

FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY  . /app

RUN javac one.java

CMD ["java", "one"]