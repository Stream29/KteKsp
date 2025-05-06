plugins {
    `kotlin-dsl`
}

kotlin {
    jvmToolchain(21)
}

dependencies {
    implementation(libs.kotlin.jvm.plugin)
    implementation(libs.kotlin.multiplatform.plugin)
    implementation(libs.maven.publish.plugin)
}
