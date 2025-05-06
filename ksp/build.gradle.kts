plugins {
    id("kotlin-jvm")
    id("publish-convention")
}

dependencies {
    implementation(project(":kteksp-annotation"))
    implementation(libs.ksp)
    implementation(libs.jte)
    implementation(libs.kte)
}