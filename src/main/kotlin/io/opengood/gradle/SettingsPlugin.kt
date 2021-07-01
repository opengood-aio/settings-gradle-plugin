package io.opengood.gradle

import io.opengood.gradle.constant.Plugins
import org.gradle.api.Plugin
import org.gradle.api.initialization.Settings

class SettingsPlugin : Plugin<Settings> {

    override fun apply(settings: Settings) {
        println("Applying $PLUGIN_ID project settings...")
        configurePlugins(settings)
    }

    private fun configurePlugins(settings: Settings) {
        with(settings) {
            with(plugins) {
                apply(Plugins.REFRESH_VERSIONS)
            }
        }
    }

    companion object {
        const val PLUGIN_ID = "io.opengood.gradle.settings"
    }
}
