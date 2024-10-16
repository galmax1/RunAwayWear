plugins {
    alias(libs.plugins.runaway.android.application.wear.compose)
}

android {
    namespace = "com.galmax.runaway.wear.app"

    defaultConfig {
        minSdk = 30
    }
}

dependencies {
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.tooling)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.lifecycle.runtime.compose)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.core.splashscreen)
    implementation(libs.bundles.koin.compose)
    implementation(libs.androidx.wear.compose.ui.tooling)
    implementation(libs.androidx.wear.preview)

    // Timber
    implementation(libs.timber)

    implementation(projects.core.presentation.designsystemWear)
    implementation(projects.run.presentation)
    implementation(projects.run.domain)
    implementation(projects.run.data)
//
    implementation(projects.core.connectivity.domain)
    implementation(projects.core.connectivity.data)
    implementation(projects.core.notification)
}