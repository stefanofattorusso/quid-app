plugins {
    `kotlin-dsl`
}


java {
    sourceCompatibility = JavaVersion.toVersion(libs.versions.sourceCompatibility.get())
    targetCompatibility = JavaVersion.toVersion(libs.versions.targetCompatibility.get())
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.compose.compiler.gradlePlugin)
}