plugins {
    id("java")
}

group = "com.google.android.material.color.utilities"
version = "193f145"

repositories {
    mavenCentral()
    google()
}

dependencies {
    compileOnly("com.google.errorprone:error_prone_annotations:2.15.0")
    compileOnly("androidx.annotation:annotation:1.2.0")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

java {
    //withJavadocJar()
    withSourcesJar()
}

tasks.jar

tasks.test {
    useJUnitPlatform()
}