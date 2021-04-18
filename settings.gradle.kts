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
        google()
        jcenter()
        maven("https://dl.bintray.com/kotlin/kotlin-dev/")//for kapt plugin 1.4.30
    }

    resolutionStrategy {
        eachPlugin {
            val pluginId = requested.id.id

            if (pluginId.startsWith("org.jetbrains.kotlin")) {
                useVersion("1.4.30")
            } else if (pluginId.startsWith("com.android.")) {
                useModule("com.android.tools.build:gradle:4.1.2")
            }
        }
    }
}

dependencyResolutionManagement {

    repositories {
        google()
        jcenter()
    }
}