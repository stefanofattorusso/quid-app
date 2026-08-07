import extension.*

plugins {
    id("android-library-conventions")
    id("org.jetbrains.kotlin.plugin.compose")
}

val catalog = project.libs

android {

    buildFeatures.compose = true
}

dependencies {
    implementation(platform(catalog.libAndroidxComposeBom))
    implementation(catalog.libAndroidxComposeMaterial3)
    implementation(catalog.libAndroidxComposeUiToolingPreview)
    implementation(catalog.libAndroidxComposeActivity)

    debugImplementation(catalog.libAndroidxComposeUiTooling)
}
