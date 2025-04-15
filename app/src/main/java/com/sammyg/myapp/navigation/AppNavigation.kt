package com.sammyg.myapp.navigation

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sammyg.myapp.HomePage
import com.sammyg.myapp.screens.SplashScreen
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
