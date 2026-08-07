plugins {
    id("android-composable-library-conventions")
}

android {
    namespace = "com.quid.home"
}

dependencies {

    implementation(project(":common:ui"))

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
