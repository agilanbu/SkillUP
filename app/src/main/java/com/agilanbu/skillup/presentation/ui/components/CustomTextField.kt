package com.agilanbu.skillup.presentation.ui.components

import androidx.compose.material3.*
import androidx.compose.runtime.Composable

@Composable
fun CustomTextField(value: String, onValueChange: (String) -> Unit, label: String) {
    TextField(value = value, onValueChange = onValueChange, label = { Text(label) })
}