FROM openjdk:17
EXPOSE 8083
ADD target/amdocsdemo.jar amdocsdemo.jar
ENTRYPOINT ["java","-jar","/amdocsdemo.jar"]