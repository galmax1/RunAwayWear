import com.galmax.runaway.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class AndroidApplicationWearComposeConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.run {
            pluginManager.run{
                apply("runaway.android.application.compose")
            }

            dependencies {
                "implementation"(libs.findLibrary("androidx.wear.compose.material").get())
                "implementation"(libs.findLibrary("androidx.wear.compose.foundation").get())
                "implementation"(libs.findLibrary("androidx.wear.compose.ui.tooling").get())
                "implementation"(libs.findLibrary("androidx.wear.preview").get())
                "implementation"(libs.findLibrary("play.services.wearable").get())
            }
        }
    }
}