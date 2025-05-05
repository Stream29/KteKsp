plugins {
    id("kotlin-jvm")
}

dependencies {
    implementation(project(":simpleksp-annotation"))
    implementation(libs.ksp)
    implementation(libs.jte)
    implementation("gg.jte:jte-runtime:3.2.1")
    implementation(libs.kte)
}