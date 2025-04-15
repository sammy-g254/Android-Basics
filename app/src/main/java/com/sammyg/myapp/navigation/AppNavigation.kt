package com.sammyg.myapp.navigation

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ndichujoseph.HomePage
import com.example.ndichujoseph.screens.AddScreen
import com.example.ndichujoseph.screens.Dashboard
import com.example.ndichujoseph.screens.LoginPage
import com.example.ndichujoseph.screens.Register
import com.example.ndichujoseph.screens.SplashScreen
import com.sammyg.myapp.screens.AddScreen
import com.sammyg.myapp.screens.addstudentScreen
import com.sammyg.myapp.screens.login
import com.sammyg.myapp.screens.register
import com.sammyg.myapp.screens.schoolDashboard

@Composable
fun AppNavigation() {
    val mockNavController = rememberNavController()
    NavHost(
        navController = mockNavController,
        startDestination = "SplashScreen"
    ) {
        composable("Login") { login(mockNavController) }
        composable("Dashboard") { schoolDashboard(mockNavController) }
        composable("AddScreen") { addstudentScreen(mockNavController) }
        composable("Register") { register(mockNavController) }
        composable("HomePage") { HomePage(mockNavController) }
        composable("SplashScreen") { SplashScreen(mockNavController) }
    }
}
