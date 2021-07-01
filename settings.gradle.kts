includeBuild("build-logic")

include(":app")
include(":feature-scanner")
include(":feature-antitheft")
include(":feature-scanner-example")
include(":feature-purchase-api")
include(":feature-purchase-impl")
include(":core-network")
include(":core-db")
include(":core-utils")
include(":module-injector")

pluginManagement {

    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }

    resolutionStrategy {
        eachPlugin {
            val pluginId = requested.id.id

            if (pluginId.startsWith("org.jetbrains.kotlin")) {
                useVersion("1.5.20")
            }
        }
    }
}

dependencyResolutionManagement {

    repositories {
        google()
        mavenCentral()
    }
}