import extension.libAndroidxComposeActivity
import extension.libAndroidxComposeBom
//import extension.libAndroidxComposeCompiler
//import extension.libAndroidxComposeFoundation
import extension.libAndroidxComposeMaterial3
import extension.libAndroidxComposeUiTooling
import extension.libAndroidxComposeUiToolingPreview
import extension.libs
import extension.versionKotlinCompiler

plugins {
    id("android-library-conventions")
}

android {

    buildFeatures.compose = true

    composeOptions.kotlinCompilerExtensionVersion = libs.versionKotlinCompiler
}

dependencies {
    implementation(platform(libs.libAndroidxComposeBom))
//    implementation(libs.libAndroidxComposeFoundation)
//    implementation(libs.libAndroidxComposeCompiler)
    implementation(libs.libAndroidxComposeMaterial3)
    implementation(libs.libAndroidxComposeUiToolingPreview)
    implementation(libs.libAndroidxComposeActivity)

    debugImplementation(libs.libAndroidxComposeUiTooling)
}