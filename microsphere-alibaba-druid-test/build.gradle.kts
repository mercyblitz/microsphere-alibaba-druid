plugins {
    id("buildlogic.java-library-conventions")
}

description = "Microsphere Alibaba Druid Test"


dependencies {
    // BOM
    // Microsphere Java Dependencies(BOM)
    implementation(platform(libs.microsphere.java.dependencies))
    // JUnit BOM
    implementation(platform(libs.junit.bom))

    // Microsphere Java Code
    "optionalApi"("io.github.microsphere-projects:microsphere-java-core")

    // Alibaba Druid
    "optionalApi"(libs.druid)

    // Testing
    api("org.junit.jupiter:junit-jupiter-api")
    api("org.junit.jupiter:junit-jupiter-engine")
    api("org.junit.platform:junit-platform-launcher")

    // H2 DataBase
    api(libs.h2)

    // Logback
    api(libs.logback.classic)
}