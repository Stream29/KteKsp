package io.github.stream29.kteksp

import org.intellij.lang.annotations.Language

/**
 * Annotation for generating Kotlin source files at compile time using KSP and KTE templates.
 *
 * This annotation is intended to be used at the file level. When applied, it triggers code generation
 * based on the provided template, outputting the generated file to the specified package and file name.
 *
 * @property packageName The package name for the generated file. If empty, the current package is used.
 * @property fileName The name of the generated file (without ".kt"). Supports template variables.
 * @property template The KTE template string used to generate the file content. Supports KTE syntax.
 */
@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
@Target(AnnotationTarget.FILE)
public actual annotation class GenerateCode(
    val packageName: String = "",
    val fileName: String = "",
    @Language("kte")
    val template: String,
)