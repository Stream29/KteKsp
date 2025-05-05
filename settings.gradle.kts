dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        mavenCentral()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

simpleKspModule("annotation")
simpleKspModule("ksp")
simpleKspModule("ksp-test")

fun simpleKspModule(name: String) {
    val prefix = "kteksp-"
    include(":$prefix$name")
    project(":$prefix$name").projectDir = file(name)
}

rootProject.name = "kteKsp"