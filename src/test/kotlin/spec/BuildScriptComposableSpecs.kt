package spec

import helper.createProjectDir
import helper.createProjectSrcDir
import helper.getSettingsGradleFile
import io.kotest.core.spec.style.wordSpec
import io.kotest.matchers.string.shouldContain
import io.opengood.gradle.SettingsPlugin
import io.opengood.gradle.enumeration.LanguageType
import org.gradle.testkit.runner.GradleRunner

fun buildScriptTest(languageType: LanguageType) = wordSpec {

    "Gradle ${languageType.toString().toLowerCase().capitalize()} DSL build script with configured plugin" should {
        "Lead to successful build" {
            val projectDir = createProjectDir()
            createProjectSrcDir(languageType, projectDir)

            val settingsGradleFile = projectDir.resolve(getSettingsGradleFile(languageType)).toFile()
            settingsGradleFile.writeText(
                """
                plugins {
                    id("io.opengood.gradle.settings")
                }
                """.trimIndent()
            )

            val result = GradleRunner.create()
                .withProjectDir(projectDir.toFile())
                .withPluginClasspath()
                .withArguments("--info", "--stacktrace")
                .build()

            println(result.output)

            result.output.shouldContain("Applying ${SettingsPlugin.PLUGIN_ID} project settings...")
            result.output.shouldContain("BUILD SUCCESSFUL")
        }
    }
}
