package test.spec

import de.fayard.refreshVersions.RefreshVersionsPlugin
import io.kotest.core.spec.style.funSpec
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.types.shouldBeTypeOf
import io.mockk.every
import io.mockk.verify
import io.opengood.gradle.SettingsPlugin
import io.opengood.gradle.constant.Plugins
import org.gradle.api.initialization.Settings

fun testSetup(settings: Settings) {
    every { settings.plugins.getPlugin(SettingsPlugin.ID) } returns SettingsPlugin()
    every { settings.plugins.apply(Plugins.REFRESH_VERSIONS) } returns RefreshVersionsPlugin()
    every { settings.plugins.getPlugin(Plugins.REFRESH_VERSIONS) } returns RefreshVersionsPlugin()
}

fun applyPluginTest(settings: Settings) =
    funSpec {
        test("Applies plugin") {
            val plugin = settings.plugins.getPlugin(SettingsPlugin.ID)
            plugin.shouldNotBeNull()
            plugin.shouldBeTypeOf<SettingsPlugin>()

            verify { settings.plugins.getPlugin(SettingsPlugin.ID) }
        }
    }

fun applyRefreshVersionsPluginTest(settings: Settings) =
    funSpec {
        test("Applies Refresh Versions plugin") {
            val plugin = settings.plugins.getPlugin(Plugins.REFRESH_VERSIONS)
            plugin.shouldNotBeNull()
            plugin.shouldBeTypeOf<RefreshVersionsPlugin>()

            verify { settings.plugins.apply(Plugins.REFRESH_VERSIONS) }
            verify { settings.plugins.getPlugin(Plugins.REFRESH_VERSIONS) }
        }
    }
