package io.github.stream29.simpleksp

import com.google.devtools.ksp.processing.Dependencies
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.processing.SymbolProcessorEnvironment
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSFile

class SimpleKsp(
    val environment: SymbolProcessorEnvironment
) : SymbolProcessor {
    override fun process(resolver: Resolver): List<KSAnnotated> {
        resolver.getSymbolsWithAnnotation(GenerateCode::class.qualifiedName!!)
            .forEach { annotated ->
                val sourceFile = annotated as KSFile
                val annotation =
                    annotated.annotations.first { it.annotationType.resolve().declaration.qualifiedName?.asString() == GenerateCode::class.qualifiedName }
                val packageName = annotation.arguments.first { it.name?.asString() == "packageName" }.value as String
                val fileName = annotation.arguments.first { it.name?.asString() == "fileName" }.value as String
                val template = annotation.arguments.first { it.name?.asString() == "template" }.value as String

                environment.codeGenerator.createNewFile(
                    dependencies = Dependencies(false, sourceFile),
                    packageName = packageName,
                    fileName = fileName
                ).bufferedWriter().use {
                    it.write(eval(template, emptyMap()))
                }
            }
        return emptyList()
    }
}