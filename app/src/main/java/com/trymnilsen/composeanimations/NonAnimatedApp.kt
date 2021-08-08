package com.trymnilsen.composeanimations

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun NonAnimatedApp() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "main") {
        composable(
            ScreenOneName,
        ) { ScreenOne() }
        composable(
            ScreenTwoName,
        ) {
            ScreenTwo()
        }
        composable("main") {
            MainScreen(navController)
        }
    }
}