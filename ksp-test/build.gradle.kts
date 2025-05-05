plugins {
    id("kotlin-jvm")
    alias(libs.plugins.ksp)
}

dependencies {
    implementation(project(":simpleksp-annotation"))
    ksp(project(":simpleksp-ksp"))
}

kotlin {
    compilerOptions {
        freeCompilerArgs.add("-Xmulti-dollar-interpolation")
    }
}