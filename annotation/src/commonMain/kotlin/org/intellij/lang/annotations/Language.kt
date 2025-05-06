package org.intellij.lang.annotations

/**
 * Hacking the original `org.intellij.lang.annotations.Language` annotation to support KMP.
 */
@Retention(AnnotationRetention.BINARY)
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER,
    AnnotationTarget.FIELD,
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.LOCAL_VARIABLE,
    AnnotationTarget.ANNOTATION_CLASS
)
public annotation class Language(
    val value: String,
    val prefix: String = "",
    val suffix: String = ""
)