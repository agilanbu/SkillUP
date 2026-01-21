package com.agilanbu.skillup.domain.repository

import com.agilanbu.skillup.domain.model.User
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface SkillUpService {

    @Headers("Accept:application/json")
    @POST
    suspend fun login(email: String, password: String): User?

    @Headers("Accept:application/json")
    @POST
    suspend fun register(name: String, email: String, password: String): User?

    @Headers("Accept:application/json")
    @GET
    suspend fun getProfile(): User?

}