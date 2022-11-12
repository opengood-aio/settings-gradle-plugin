package test

import io.opengood.gradle.constant.Directories
import io.opengood.gradle.enumeration.LanguageType
import io.opengood.gradle.enumeration.SettingsGradleType
import java.nio.file.Files
import java.nio.file.Path

internal fun createProjectDir(): Path =
    Files.createTempDirectory("")

internal fun createProjectSrcDir(languageType: LanguageType, projectDir: Path) =
    when (languageType) {
        LanguageType.GROOVY -> projectDir.resolve(Directories.GROOVY_SRC).toFile().mkdirs()
        LanguageType.JAVA -> projectDir.resolve(Directories.JAVA_SRC).toFile().mkdirs()
        LanguageType.KOTLIN -> projectDir.resolve(Directories.KOTLIN_SRC).toFile().mkdirs()
    }

internal fun getSettingsGradleFile(languageType: LanguageType): String =
    when (languageType) {
        LanguageType.KOTLIN -> SettingsGradleType.KOTLIN.toString()
        else -> SettingsGradleType.GROOVY.toString()
    }
