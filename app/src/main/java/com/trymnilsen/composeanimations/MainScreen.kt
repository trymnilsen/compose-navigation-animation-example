package com.trymnilsen.composeanimations

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun MainScreen(navController: NavHostController) {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Main Screen") }) },
        content = {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize(),
            ) {
                Button(
                    onClick = { navController.navigate(ScreenOneName) },
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text("Screen 1")
                }
                Button(
                    onClick = { navController.navigate(ScreenTwoName) },
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text("Screen 2")
                }
            }
        }
    )
}