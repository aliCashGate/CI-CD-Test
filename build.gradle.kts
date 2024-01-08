import dependencies.Dependencies
import dependencies.Versions

buildscript {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }

    dependencies {
////        classpath("com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}")
//        classpath(Dependencies.hiltAgp)
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.45")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.10")
        classpath("com.squareup:javapoet:1.13.0")
        classpath("com.google.gms:google-services:4.4.0")

    }
}
