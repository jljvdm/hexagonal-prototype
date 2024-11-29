plugins {
    id ("java")
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
