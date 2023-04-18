plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.hivemq:hivemq-mqtt-client:1.3.0")
    implementation("ch.qos.logback:logback-classic:${property("logback.version")}")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testImplementation("ch.qos.logback:logback-classic:${property("logback.version")}")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}