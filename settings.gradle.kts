pluginManagement {
    includeBuild("build-logic")
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

gradle.startParameter.excludedTaskNames.addAll(listOf(":build-logic:convention:testClasses"))

rootProject.name = "RunawayWear"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
include(":app")
include(":core:connectivity:domain")
include(":core:connectivity:data")
include(":core:data")
include(":core:domain")
include(":core:notification")
include(":core:presentation:designsystem")
include(":core:presentation:designsystem_wear")
include(":core:presentation:ui")
include(":run")
include(":run:data")
include(":run:domain")
include(":run:presentation")
