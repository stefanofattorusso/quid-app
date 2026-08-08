import extension.*

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.plugin.compose")
    id("com.google.devtools.ksp")
}

val catalog = project.libs

android {
    compileSdk = catalog.sdkCompile

    defaultConfig {
        minSdk = catalog.sdkMin
        targetSdk = catalog.sdkTarget

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    }

    compileOptions {
        targetCompatibility = catalog.targetCompatibility
        sourceCompatibility = catalog.sourceCompatibility
    }

    packaging {
        resources {
            excludes.add("META-INF/LICENSE.md")
            excludes.add("META-INF/LICENSE-notice.md")
            excludes.add("META-INF/*.kotlin_module")
        }
    }
}
