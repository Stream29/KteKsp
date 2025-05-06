import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.jvm)
}

kotlin {
    jvmToolchain(21)
    compilerOptions {
        jvmTarget = JvmTarget.JVM_1_8
        freeCompilerArgs.addAll("-Xjdk-release=1.8", "-Xjvm-default=all-compatibility")
    }
}

tasks.withType<JavaCompile>().configureEach {
    targetCompatibility = "1.8"
}