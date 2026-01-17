package com.agilanbu.skillup.presentation.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.agilanbu.skillup.presentation.ui.LoginScreen
import com.agilanbu.skillup.presentation.ui.ProfileScreen
import com.agilanbu.skillup.presentation.viewmodel.AuthViewModel

@Composable
fun AppNavHost(viewModel: AuthViewModel) {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "login") {
        composable("login") {
            LoginScreen(viewModel) { navController.navigate("profile") }
        }
        composable("profile") {
            ProfileScreen(viewModel)
        }
    }
}
