package com.agilanbu.skillup.domain.repository

import com.agilanbu.skillup.domain.model.User

interface AuthRepository {
    suspend fun login(email: String, password: String): User?
    suspend fun register(name: String, email: String, password: String): User?
    suspend fun getProfile(): User?
}
