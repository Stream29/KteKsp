plugins {
    id("kotlin-jvm")
}

dependencies {
    implementation(project(":kteksp-annotation"))
    implementation(libs.ksp)
    implementation(libs.jte)
    implementation(libs.kte)
}