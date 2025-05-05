# SimpleKsp: KTE Template-based Code Generation with KSP

SimpleKsp is a Kotlin Symbol Processing (KSP) library that enables compile-time code generation using [KTE](https://github.com/valich/intellij-kt-template) templates. It provides a simple annotation, `@GenerateCode`, to generate Kotlin source files based on template strings.

## Features
- **KSP-based**: Fast, incremental code generation during compilation.
- **KTE template support**: Write templates in KTE for flexible, type-safe code generation.
- **File-level annotation**: Use `@file:GenerateCode` to trigger generation from any Kotlin file.

## Usage

### 1. Add the Dependency


### 2. Annotate a File
Use the `@file:GenerateCode` annotation at the top of a Kotlin file to specify generation parameters:

```kotlin
@file:GenerateCode(
    packageName = "io.github.stream29.kteksp",
    fileName = "Generated$0",
    template =
    """
    @file:GenerateCode(
        packageName = \"io.github.stream29.kteksp\",
        fileName = \"Generated$1\",
        template = \"\"
    )
    package io.github.stream29.kteksp
    """
)

package io.github.stream29.kteksp
```

- `packageName`: The package for the generated file. If empty, uses the current package.
- `fileName`: The name of the generated file (without `.kt`). Supports template variables.
- `template`: The KTE template string for the generated file content.

### 3. Build the Project
Run the build. The KSP processor will generate the specified files in the `build/generated/ksp/` directory.

## Annotation Reference

```kotlin
@Target(AnnotationTarget.FILE)
public annotation class GenerateCode(
    val packageName: String = "",
    val fileName: String = "",
    @Language("kte")
    val template: String,
)
```

- **packageName**: Target package for the generated file.
- **fileName**: Name of the generated file (without `.kt`).
- **template**: KTE template string for the file content.

## Example
See [`Generate.kt`](ksp-test/src/main/kotlin/io/github/stream29/kteksp/Generate.kt) for a real usage example.

