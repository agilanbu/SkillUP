package com.agilanbu.skillup.data.repository

import com.agilanbu.skillup.data.datasource.AuthDataSource
import com.agilanbu.skillup.domain.model.User
import com.agilanbu.skillup.domain.repository.AuthRepository


class AuthRepositoryImpl(private val dataSource: AuthDataSource) : AuthRepository {
    override suspend fun login(email: String, password: String): User? =
        dataSource.login(email, password)

    override suspend fun register(name: String, email: String, password: String): User? =
        dataSource.register(name, email, password)

    override suspend fun getProfile(): User? = dataSource.getProfile()
}
