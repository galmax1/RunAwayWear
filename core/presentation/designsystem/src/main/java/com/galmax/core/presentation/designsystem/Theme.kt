package com.galmax.core.presentation.designsystem

import android.app.Activity
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

val DarkColorScheme = darkColorScheme(
    primary = RunAwayGreen,
    background = RunAwayBlack,
    surface = RunAwayDarkGray,
    secondary = RunAwayWhite,
    tertiary = RunAwayWhite,
    primaryContainer = RunAwayGreen30,
    onPrimary = RunAwayBlack,
    onBackground = RunAwayWhite,
    onSurface = RunAwayWhite,
    onSurfaceVariant = RunAwayGray,
    error = RunAwayDarkRed,
    errorContainer = RunAwayDarkRed5
)

@Composable
fun RunAwayTheme(
    content: @Composable () -> Unit
) {
    val colorScheme = DarkColorScheme
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = false
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}