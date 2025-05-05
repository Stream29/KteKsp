plugins {
    id("kotlin-jvm")
    alias(libs.plugins.ksp)
}

dependencies {
    implementation(project(":kteksp-annotation"))
    ksp(project(":kteksp-ksp"))
}

kotlin {
    compilerOptions {
        freeCompilerArgs.add("-Xmulti-dollar-interpolation")
    }
}