plugins {
    alias(libs.plugins.android.composable.library.conventions)
}

android {
    namespace = "com.quid.home"
}

dependencies {

    implementation(project(":common:ui"))

    implementation(libs.androidx.core.ktx)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
