plugins {
    id("kotlin-jvm")
}

dependencies {
    implementation(project(":simpleksp-annotation"))
    implementation(libs.ksp)
    implementation(libs.jte)
    implementation(libs.kte)
}