plugins {
    id ("java")
    id ("org.springframework.boot") version "3.4.0" apply false
    id ("io.spring.dependency-management") version "1.1.4"
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
dependencies {
    compileOnly(project(":domain"))
    compileOnly("org.springframework.boot:spring-boot:3.4.0")
    compileOnly ("org.projectlombok:lombok:1.18.36")
    annotationProcessor ("org.projectlombok:lombok:1.18.36")

    testCompileOnly ("org.projectlombok:lombok:1.18.36")
    testAnnotationProcessor ("org.projectlombok:lombok:1.18.36")

}