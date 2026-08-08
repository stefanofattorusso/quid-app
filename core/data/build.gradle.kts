plugins {
    alias(libs.plugins.android.library.conventions)
}

android {
    namespace = "com.quid.data"
}

dependencies {



    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
}