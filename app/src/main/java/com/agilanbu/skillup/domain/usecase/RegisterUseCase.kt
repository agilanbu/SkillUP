package com.agilanbu.skillup.domain.usecase

import com.agilanbu.skillup.domain.model.User
import com.agilanbu.skillup.domain.repository.AuthRepository
import javax.inject.Inject

class RegisterUseCase @Inject constructor(private val repository: AuthRepository) {
    suspend operator fun invoke(name: String, email: String, password: String): User? {
        return repository.register(name, email, password)
    }
}