package io.github.stream29.kteksp

import gg.jte.CodeResolver
import gg.jte.ContentType
import gg.jte.TemplateEngine
import gg.jte.output.StringOutput
import java.nio.file.Paths

class MockCodeResolver(
    val content: Pair<String, String>
) : CodeResolver {
    override fun resolve(name: String?): String? {
        if (name == content.first) {
            return content.second
        }
        return null
    }

    override fun getLastModified(name: String?): Long = 0
}

fun eval(template: String, args: Map<String, Any?>): String {
    val resolver = MockCodeResolver("template.kte" to template)
    val engine = TemplateEngine.create(
        resolver,
        Paths.get("build/jte"),
        ContentType.Plain,
        TemplateEngine::class.java.classLoader
    )
    val output = StringOutput()
    engine.render("template.kte", args, output)
    return output.toString()
}