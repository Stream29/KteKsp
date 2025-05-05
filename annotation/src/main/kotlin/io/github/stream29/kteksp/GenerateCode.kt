package io.github.stream29.kteksp

import org.intellij.lang.annotations.Language

@Target(AnnotationTarget.FILE)
public annotation class GenerateCode(
    val packageName: String = "",
    val fileName: String = "",
    @Language("kte")
    val template: String,
)
