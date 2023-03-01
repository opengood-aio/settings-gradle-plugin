package test

import io.opengood.gradle.enumeration.LanguageType
import io.opengood.gradle.enumeration.SettingsGradleType
import io.opengood.gradle.enumeration.SrcDirType
import java.nio.file.Files
import java.nio.file.Path

internal fun createProjectDir(): Path =
    Files.createTempDirectory("")

internal fun createProjectSrcDir(languageType: LanguageType, projectDir: Path): Boolean =
    when (languageType) {
        LanguageType.GROOVY -> projectDir.resolve(SrcDirType.GROOVY.first()).toFile().mkdirs()
        LanguageType.JAVA -> projectDir.resolve(SrcDirType.JAVA.first()).toFile().mkdirs()
        LanguageType.KOTLIN -> projectDir.resolve(SrcDirType.KOTLIN.first()).toFile().mkdirs()
    }

internal fun getSettingsGradleFile(languageType: LanguageType): String =
    when (languageType) {
        LanguageType.KOTLIN -> SettingsGradleType.KOTLIN_DSL.toString()
        else -> SettingsGradleType.GROOVY_DSL.toString()
    }
