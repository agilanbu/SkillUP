package com.agilanbu.skillup.domain.usecase

import com.agilanbu.skillup.domain.model.User
import com.agilanbu.skillup.domain.repository.AuthRepository
import javax.inject.Inject


class LoginUseCase @Inject constructor(private val authRepository: AuthRepository) {
    suspend operator fun invoke(email: String, password: String) : User?{
       return authRepository.login(email, password)
    }
}