plugins {
    alias(libs.plugins.runaway.android.library)
}

android {
    namespace = "com.galmax.core.data"
}

dependencies {
    implementation(libs.timber)
    implementation(libs.bundles.koin)

    implementation(projects.core.domain)
}