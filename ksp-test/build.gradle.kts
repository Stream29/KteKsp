plugins {
    id("kotlin-jvm")
    alias(libs.plugins.ksp)
}

dependencies {
    testImplementation(kotlin("test"))
}