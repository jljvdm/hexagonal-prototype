plugins {
    java
    war
    id("org.springframework.boot") version "3.4.0"
    id("io.spring.dependency-management") version "1.1.5"
}

group = "nu.bldr.demo.hexagonalprototype"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(23)
    }
}

repositories {
    mavenCentral()
}

configurations {
    implementation.configure {
        exclude(module = "spring-boot-starter-tomcat")
        exclude("org.apache.tomcat")
    }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    //implementation("org.springframework.boot:spring-boot-starter-undertow")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("io.github.linpeilie:mapstruct-plus-spring-boot-starter:1.4.6")
    implementation("org.springdoc:springdoc-openapi-starter-webflux-api:2.7.0")
    implementation("org.springdoc:springdoc-openapi-starter-webflux-ui:2.7.0")
    implementation(project(":domain"))
    implementation(project(":hexagonal"))
    implementation(project(":restapi"))
    implementation(project(":infrastructure"))
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("io.projectreactor:reactor-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
