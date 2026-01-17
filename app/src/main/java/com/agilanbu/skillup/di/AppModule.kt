package com.agilanbu.skillup.di

import com.agilanbu.skillup.data.datasource.AuthDataSource
import com.agilanbu.skillup.data.repository.AuthRepositoryImpl
import com.agilanbu.skillup.domain.repository.AuthRepository
import com.agilanbu.skillup.domain.usecase.GetProfileUseCase
import com.agilanbu.skillup.domain.usecase.LoginUseCase
import com.agilanbu.skillup.domain.usecase.RegisterUseCase


object AppModule {
    private val dataSource = AuthDataSource()
    private val repository: AuthRepository = AuthRepositoryImpl(dataSource)

    val loginUseCase = LoginUseCase(repository)
    val registerUseCase = RegisterUseCase(repository)
    val getProfileUseCase = GetProfileUseCase(repository)
}
