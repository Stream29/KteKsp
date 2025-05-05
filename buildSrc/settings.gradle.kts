dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        mavenCentral()
    }

}

plugins {
    id("dev.panuszewski.typesafe-conventions") version "0.6.0"
}

rootProject.name = "buildSrc"