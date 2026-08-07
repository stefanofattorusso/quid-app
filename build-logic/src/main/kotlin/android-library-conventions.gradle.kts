import extension.*

plugins {
    id("com.android.library")
    id("kotlin-conventions")
}

val catalog = project.libs

android {
    compileSdk = catalog.sdkCompile

    defaultConfig {
        minSdk = catalog.sdkMin
    }

    compileOptions {
        targetCompatibility = catalog.targetCompatibility
        sourceCompatibility = catalog.sourceCompatibility
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}
