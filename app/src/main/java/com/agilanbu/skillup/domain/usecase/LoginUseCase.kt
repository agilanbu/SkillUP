package com.agilanbu.skillup.domain.usecase

import com.agilanbu.skillup.domain.model.User
import com.agilanbu.skillup.domain.repository.AuthRepository

class LoginUseCase(private val repository: AuthRepository) {
    suspend operator fun invoke(email: String, password: String): User? {
        return repository.login(email, password)
    }
}