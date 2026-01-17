package com.agilanbu.skillup.data.mapper

import com.agilanbu.skillup.domain.model.User

// Example if you had DTOs from API
fun mapUserDtoToDomain(id: String, name: String, email: String): User {
    return User(id, name, email)
}