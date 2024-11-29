plugins {
    id 'org.springframework.boot' version '3.4.0' apply false
    id 'io.spring.dependency-management' version '1.1.5'
    id 'java'
}

group = "nu.bldr.demo.hexagonal-prototype"
version = '0.0.1-SNAPSHOT'

java {
    sourceCompatibility = '23'
}

repositories {
    mavenCentral()
}

dependencyManagement {
    imports {
        mavenBom org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES
    }
}

dependencies {
    implementation 'org.springframework.boot:spring-boot'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
}

tasks.withType(JavaCompile).configureEach {
    options.compilerArgs.add("-parameters")
}