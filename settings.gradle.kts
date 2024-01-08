pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven { url = uri("https://jitpack.io") }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        maven { url = uri("https://jitpack.io") }
        mavenCentral()
    }
}

rootProject.name = "Kulushae"
include(":app")
include(":core")
include(":common")
include(":data")
include(":domain")
include(":presentation")
include(":feature_home")
include(":feature_favourite")
include(":feature_chat")
include(":feature_profile")
include(":feature_ad")
include(":feature_auth")
include(":authentication")
include(":feature_ad_posting")
