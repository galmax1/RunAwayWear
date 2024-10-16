package com.galmax.runaway.wear.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.galmax.core.notification.ActiveRunService
import com.galmax.core.presentation.designsystem_wear.RunawayTheme
import com.galmax.wear.run.presentation.TrackerScreenRoot

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)

        setContent {
            RunawayTheme {
                TrackerScreenRoot(
                    onServiceToggle = { shouldStartRunning ->
                        if (shouldStartRunning) {
                            startService(
                                ActiveRunService.createStartIntent(
                                    applicationContext, this::class.java
                                )
                            )
                        } else {
                            startService(
                                ActiveRunService.createStopIntent(
                                    applicationContext
                                )
                            )
                        }
                    }
                )
            }
        }
    }

}