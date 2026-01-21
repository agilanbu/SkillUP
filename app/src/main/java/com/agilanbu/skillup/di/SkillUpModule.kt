package com.agilanbu.skillup.di

import com.agilanbu.skillup.domain.repository.SkillUpService
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
open class SkillUpModule {

    @Provides
    @Singleton
    open fun provideSkillUpServiced(): SkillUpService = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .client(OkHttpClient())
        .build().create(SkillUpService::class.java)


    companion object {
        const val baseUrl = "https://api.skillup.com/"
    }

}