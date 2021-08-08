package com.trymnilsen.composeanimations

import androidx.compose.animation.*
import androidx.compose.animation.core.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.IntOffset
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable
import com.google.accompanist.navigation.animation.rememberAnimatedNavController

val springSpec = spring<IntOffset>(dampingRatio = Spring.DampingRatioMediumBouncy)
val tweenSpec = tween<IntOffset>(durationMillis = 2000, easing = CubicBezierEasing(0.08f,0.93f,0.68f,1.27f))
@ExperimentalAnimationApi
@Composable
fun AnimatedApp() {
    val navController = rememberAnimatedNavController()
    AnimatedNavHost(navController, startDestination = "main") {
        composable(
            ScreenOneName,
            enterTransition = { initial, _ ->
                slideInHorizontally(initialOffsetX = { 1000 }, animationSpec = springSpec)
            },
            exitTransition = { _, target ->
                slideOutHorizontally(targetOffsetX = { -1000 }, animationSpec = springSpec)
            },
            popEnterTransition = { initial, _ ->
                slideInHorizontally(initialOffsetX = { -1000 }, animationSpec = springSpec)
            },
            popExitTransition = { _, target ->
                slideOutHorizontally(targetOffsetX = { 1000 }, animationSpec = springSpec)
            }
        ) { ScreenOne() }
        composable(
            ScreenTwoName,
            enterTransition = { initial, _ ->
                slideInVertically(initialOffsetY = { 1000 }, animationSpec = tweenSpec)
            },
            exitTransition = { _, target ->
                slideOutVertically(targetOffsetY = { -1000 }, animationSpec = tweenSpec)
            },
            popEnterTransition = { initial, _ ->
                slideInVertically(initialOffsetY = { -1000 }, animationSpec = tweenSpec)
            },
            popExitTransition = { _, target ->
                slideOutVertically(targetOffsetY = { 1000 }, animationSpec = tweenSpec)
            }
        ) {
            ScreenTwo()
        }
        composable("main") {
            MainScreen(navController)
        }
    }
}
