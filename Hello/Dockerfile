# Use the official maven/Java 8 image to create a build artifact.
# https://hub.docker.com/_/maven
# FROM maven:3.5-jdk-8-alpine as builder
FROM openjdk:8-jre-alpine

COPY /target/Hello-0.1.jar /hello-0.1.jar
COPY ./startservices.sh /startservices.sh

# 	CMD ./startservices.sh

# to build; docer build .
# to run: docker run -- name helloworld <imge id>

# Copy to rhel1
# scp -r ./* tores@rhel1.local:./TwitterToKafka