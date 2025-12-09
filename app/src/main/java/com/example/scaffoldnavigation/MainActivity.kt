package com.example.scaffoldnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.scaffoldnavigation.ui.screens.ScaffoldApp
import com.example.scaffoldnavigation.ui.theme.ScaffoldNavigationTheme

object Routes {
    const val MAIN_SCREEN = "home"
    const val INFO_SCREEN = "info"
    const val SETTINGS_SCREEN = "settings"
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScaffoldNavigationTheme {
                ScaffoldApp()
            }
        }
    }
}
