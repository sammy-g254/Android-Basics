package com.sammyg.myapp.navigation

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sammyg.myapp.HomePage
import com.sammyg.myapp.screens.SplashScreen
import com.sammyg.myapp.screens.addstudentScreen
import com.sammyg.myapp.screens.login
import com.sammyg.myapp.screens.register
import com.sammyg.myapp.screens.schoolDashboard
import com.sammyg.myapp.viewmodel.AuthViewModel

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val authViewModel: AuthViewModel = viewModel()
    NavHost(
        navController = NavController,
        startDestination = "SplashScreen"
    ) {
        composable("Login") { login(navController) }
        composable("Dashboard") { schoolDashboard(navController) }
        composable("AddScreen") { addstudentScreen(navController) }
        composable("Register") { register(navController,authViewModel) }
        composable("HomePage") { HomePage(navController) }
        composable("SplashScreen") { SplashScreen(navController) }
    }
}
