import dependencies.accompanist
import dependencies.common
import dependencies.compose
import dependencies.core
import dependencies.data
import dependencies.dataStore
import dependencies.domain
import dependencies.featureAd
import dependencies.featureAuth
import dependencies.featureChat
import dependencies.featureCreateAd
import dependencies.featureFavourite
import dependencies.featureHome
import dependencies.featureProfile
import dependencies.graphQL
import dependencies.hilt
import dependencies.presentation
import dependencies.retrofit
import dependencies.room
import dependencies.snackBar
import org.jetbrains.kotlin.konan.properties.Properties
import java.io.FileInputStream

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("dagger.hilt.android.plugin")
    id("kotlin-kapt")
//    kotlin("kapt")
    id("com.google.gms.google-services")
    id("com.apollographql.apollo3").version("3.8.2")
}


apollo {
    service("service") {
        packageName.set("com.cashgate")
        generateApolloMetadata.set(true)
    }
}

android {
    namespace = "com.cashgate.kulushae"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.cashgate.kulushae"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }

        buildFeatures {
            buildConfig = true
        }

        val apiKeyPropertiesFile = rootProject.file("apikey.properties")
        val apiKeyProperties = Properties()
        apiKeyProperties.load(FileInputStream(apiKeyPropertiesFile))

        buildConfigField("String", "API_URL", apiKeyProperties.getProperty("API_URL"))
        buildConfigField("String", "API_SECRET", apiKeyProperties.getProperty("API_SECRET"))
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

    kapt {
        generateStubs = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
    implementation("androidx.activity:activity-compose:1.7.2")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

    retrofit()
    room()
    hilt()
    compose()
    accompanist()

    core()
    data()
    common()
    presentation()
    domain()
    featureHome()
    featureAd()
    featureAuth()
    featureChat()
    featureFavourite()
    featureProfile()
    featureCreateAd()

    graphQL()
    apolloMetadata(project(":core"))

    snackBar()

    dataStore()

    implementation(platform("com.google.firebase:firebase-bom:32.3.1"))
    implementation("com.google.firebase:firebase-analytics-ktx")
    implementation("com.google.firebase:firebase-auth-ktx")

    implementation("dev.shreyaspatil.permission-flow:permission-flow-compose:1.2.0")

    implementation("com.microsoft.appcenter:appcenter-analytics:4.4.5")
    implementation("com.microsoft.appcenter:appcenter-crashes:4.4.5")

    //implementation("com.apollographql.apollo3:apollo-runtime:3.8.2")


    /*// Dagger Hilt
    implementation ("androidx.hilt:hilt-navigation-compose:1.0.0")
    implementation("com.google.dagger:hilt-android:2.45")
    kapt("com.google.dagger:hilt-android-compiler:2.45")
//    implementation("androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03")
    implementation("androidx.hilt:hilt-work:1.0.0")
    kapt("androidx.hilt:hilt-compiler:1.0.0")

    // For Kotlin
    implementation("androidx.work:work-runtime-ktx:2.8.1")*/


//    booksUi()
//    booksDataSource()
}