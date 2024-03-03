plugins {
    kotlin("jvm") version "1.9.0"
    application
}

group = "com.devkuma.kotest.tutorial"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation("org.apache.commons:commons-lang3:3.14.0")

    testImplementation(kotlin("test"))
    testImplementation("io.kotest:kotest-runner-junit5:5.8.0")
    testImplementation("io.kotest:kotest-framework-datatest:5.8.0")
    testImplementation("io.kotest:kotest-property:5.8.0")


    testImplementation("org.testcontainers:junit-jupiter:1.19.6")
    testImplementation("org.testcontainers:testcontainers:1.19.6")
    testImplementation("org.testcontainers:postgresql:1.19.6")


    //testImplementation("io.kotest.extensions:kotest-extensions-testcontainers:2.0.2")
    //testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.2")


    testImplementation("io.mockk:mockk:1.13.9")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}