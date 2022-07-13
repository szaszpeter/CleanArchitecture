package com.codarchy.data

import com.codarchy.data.network.AgeApi
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

fun createAgeApi(): AgeApi = Retrofit
    .Builder()
    .baseUrl("https://api.agify.io")
    .addConverterFactory(MoshiConverterFactory.create())
    .build()
    .create(AgeApi::class.java)
