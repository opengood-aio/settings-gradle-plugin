package test.model

import io.opengood.gradle.enumeration.LanguageType

data class ProjectConfig(
    val languageType: LanguageType,
    val name: String = "test",
    val group: String = "org.example",
    val version: String = "1.0.0-SNAPSHOT",
    val srcDir: Boolean = true,
    val buildGradle: Boolean = true,
    val settingsGradle: Boolean = true
)
