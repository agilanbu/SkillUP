package com.agilanbu.skillup.presentation.ui


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.agilanbu.skillup.presentation.viewmodel.AuthViewModel

@Composable
fun ProfileScreen(viewModel: AuthViewModel) {
    val user by viewModel.user.collectAsState()

    Column(Modifier.padding(16.dp)) {
        Text(text = "Profile", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(8.dp))
        user?.let {
            Text("Name: ${it.name}")
            Text("Email: ${it.email}")
        } ?: Text("No user logged in")
    }
}
