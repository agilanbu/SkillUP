package com.agilanbu.skillup.domain.usecase

import com.agilanbu.skillup.domain.model.User
import com.agilanbu.skillup.domain.repository.AuthRepository


class GetProfileUseCase(private val repository: AuthRepository) {
    suspend operator fun invoke(): User? {
        return repository.getProfile()
    }
}
