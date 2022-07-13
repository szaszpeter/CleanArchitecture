package com.codarchy.data.di

import com.codarchy.data.network.AgeApi
import com.codarchy.data.createAgeApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    fun provideAgeApi(): AgeApi = createAgeApi()

}
