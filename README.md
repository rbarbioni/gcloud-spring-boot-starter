## Sample project Java Spring-Boot running Google App Engine (Google Cloud Platform)

# Tecnologies

- Java 8
- Spring-boot
- Spring-Web
- Spring-Data-JPA
- Embedded Tomcat
- App Engine

# Instructions
    Before run project, create Google Cloud Platform Free-Trial account
[Google Cloud Platform Free-Trial](https://cloud.google.com/free/)


-----------------------------------------------------------------------
#### Clone and build project

```shell
git clone https://github.com/rbarbioni/gcloud-spring-boot-starter.git
cd gcloud-spring-boot-starter
./gradlew clean build
```

#### Configure Google Account Project

[Quickstart for Java in the App Engine Flexible Environment](https://cloud.google.com/java/getting-started/hello-world)

```sh

gcloud config set project YOUR_PROJECT_ID
./gradlew appengineDeploy
```

### Test

GET -> https://PROJECT_ID.appspot.com/user