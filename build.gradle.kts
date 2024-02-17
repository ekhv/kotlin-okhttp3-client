plugins {
    application
    kotlin("jvm") version "1.9.22"
}

group = "org.example"
version = "1.0.0"

application {
    mainClass.set("org.example.MainKt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("com.squareup.okhttp3:okhttp-bom:4.12.0"))
    implementation("com.squareup.okhttp3:okhttp")
    implementation("com.squareup.okhttp3:logging-interceptor")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation(kotlin("script-runtime"))
    implementation("com.google.code.gson:gson:2.10.1")

}


kotlin {
    jvmToolchain(11)
}
