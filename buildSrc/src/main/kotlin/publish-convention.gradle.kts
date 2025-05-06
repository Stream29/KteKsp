import com.vanniktech.maven.publish.*

plugins {
    alias(libs.plugins.maven.publish)
}

mavenPublishing {
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
    coordinates((group as String), project.name, version.toString())
    signAllPublications()
    pom {
        name.set("KteKsp")
        description.set("Kotlin template engine for KSP")
        inceptionYear.set("2025")
        url.set("https://github.com/stream29/KteKsp")
        licenses {
            license {
                name.set("The Apache License, Version 2.0")
                url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
                distribution.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
            }
        }
        developers {
            developer {
                id.set("Stream29")
                name.set("Stream")
                url.set("https://github.com/Stream29")
            }
            developer {
                id.set("ConstasJ")
                name.set("ConstasJ")
                url.set("https://github.com/ConstasJ")
            }
        }
        scm {
            url.set("https://github.com/Stream29/KteKsp")
            connection.set("scm:git:git://github.com/Stream29/KteKsp.git")
            developerConnection.set("scm:git:ssh://git@github.com/Stream29/KteKsp.git")
        }
    }
}