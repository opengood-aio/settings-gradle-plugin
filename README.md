# OpenGood Settings Gradle Plugin

[![Build](https://github.com/opengoodio/settings-gradle-plugin/workflows/build/badge.svg)](https://github.com/opengoodio/settings-gradle-plugin/actions?query=workflow%3Abuild)
[![Release](https://github.com/opengoodio/settings-gradle-plugin/workflows/release/badge.svg)](https://github.com/opengoodio/settings-gradle-plugin/actions?query=workflow%3Arelease)
[![Codecov](https://codecov.io/gh/opengoodio/settings-gradle-plugin/branch/main/graph/badge.svg?token=AEEYTGK87F)](https://codecov.io/gh/opengoodio/settings-gradle-plugin)
[![Release Version](https://img.shields.io/github/release/opengoodio/settings-gradle-plugin.svg)](https://github.com/opengoodio/settings-gradle-plugin/releases/latest)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](https://raw.githubusercontent.com/opengoodio/settings-gradle-plugin/master/LICENSE)
[![FOSSA](https://app.fossa.com/api/projects/custom%2B22161%2Fgithub.com%2Fopengoodio%settings-gradle-plugin.svg?type=small)](https://app.fossa.com/projects/custom%2B22161%2Fgithub.com%2Fopengoodio%settings-gradle-plugin?ref=badge_small)

Gradle plugin providing centralized settings of OpenGood Gradle projects

## Usage

Add `opengood-settings` Gradle plugin to `setttings.gradle.kts`:

```kotlin
plugins {
    id("io.opengood.gradle.settings") version "VERSION"
}
```

**Note:** See *Release* version badge above for latest version.

## Development

See [OpenGood Development Documentation](https://github.com/opengoodio/config-gradle-plugin#development)

## Publish

See
[OpenGood Publishing Documentation](https://github.com/opengoodio/config-gradle-plugin#publish)
