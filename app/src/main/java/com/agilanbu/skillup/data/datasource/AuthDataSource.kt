package com.agilanbu.skillup.data.datasource

import com.agilanbu.skillup.domain.model.User


class AuthDataSource {
    private var fakeUser: User? = null

    suspend fun login(email: String, password: String): User? {
        return if (email == "test@test.com" && password == "1234") {
            fakeUser = User("1", "Test User", email)
            fakeUser
        } else null
    }

    suspend fun register(name: String, email: String, password: String): User? {
        fakeUser = User("2", name, email)
        return fakeUser
    }

    suspend fun getProfile(): User? = fakeUser
}
