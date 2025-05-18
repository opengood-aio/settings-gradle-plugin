package io.opengood.gradle

import io.kotest.core.spec.style.FunSpec
import io.mockk.mockk
import org.gradle.api.initialization.Settings
import test.spec.applyPluginTest
import test.spec.applyRefreshVersionsPluginTest
import test.spec.testSetup

class SettingsPluginTest :
    FunSpec({

        val settings = mockk<Settings>()
        testSetup(settings)

        val plugin = SettingsPlugin()
        plugin.apply(settings)

        include(applyPluginTest(settings))

        include(applyRefreshVersionsPluginTest(settings))
    })
