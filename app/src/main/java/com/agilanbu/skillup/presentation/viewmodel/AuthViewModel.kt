package com.agilanbu.skillup.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.agilanbu.skillup.domain.model.User
import com.agilanbu.skillup.domain.usecase.GetProfileUseCase
import com.agilanbu.skillup.domain.usecase.LoginUseCase
import com.agilanbu.skillup.domain.usecase.RegisterUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val loginUseCase: LoginUseCase,
    private val registerUseCase: RegisterUseCase,
    private val getProfileUseCase: GetProfileUseCase
) : ViewModel() {

    private val _user = MutableStateFlow<User?>(null)
    val user: StateFlow<User?> = _user

    fun login(email: String, password: String) {
        viewModelScope.launch {
            _user.value = loginUseCase(email, password)
        }
    }

    fun register(name: String, email: String, password: String) {
        viewModelScope.launch {
            _user.value = registerUseCase(name, email, password)
        }
    }

    fun loadProfile() {
        viewModelScope.launch {
            _user.value = getProfileUseCase()
        }
    }
}