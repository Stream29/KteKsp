@file:OptIn(ExperimentalKotlinGradlePluginApi::class)

import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi

plugins {
    id("kotlin-multiplatform")
    id("publish-convention")
}

kotlin {
    explicitApi()
}
