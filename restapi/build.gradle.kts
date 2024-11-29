plugins {
    id 'org.springframework.boot' version '3.4.0'
    id 'io.spring.dependency-management' version '1.1.5'
    id 'java'
}

group = "nu.bldr.demo.hexagonal-prototype"
version = "0.0.1-SNAPSHOT"


java {
    sourceCompatibility = '23'
}

repositories {
    mavenCentral()
}

dependencies {
    implementation 'org.springframework.boot:spring-boot-starter'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
}