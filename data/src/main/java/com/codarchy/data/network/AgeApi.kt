package com.codarchy.data.network

import retrofit2.http.GET

interface AgeApi {
    @GET
    suspend fun getAgeEstimation(): AgeResponse
}
