package com.trymnilsen.composeanimations

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun ScreenTwo() {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Screen Two") }) },
        content = { Text("Welcome to screen two") }
    )
}

const val ScreenTwoName = "Two"