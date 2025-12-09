package com.example.scaffoldnavigation.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.scaffoldnavigation.Routes

@Composable
fun ScaffoldApp() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Routes.MAIN_SCREEN
    ) {
        composable(Routes.MAIN_SCREEN) {
            MainScreen(navController = navController)
        }
        composable(Routes.INFO_SCREEN) {
            InfoScreen(navController = navController)
        }
        composable(Routes.SETTINGS_SCREEN) {
            SettingsScreen(navController = navController)
        }
    }
}