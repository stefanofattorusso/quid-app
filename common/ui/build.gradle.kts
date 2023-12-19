plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    id("android-composable-library-conventions")
    id("kotlin-conventions")
}

android {
    namespace = "com.quid.quidapp.common.ui"
}
