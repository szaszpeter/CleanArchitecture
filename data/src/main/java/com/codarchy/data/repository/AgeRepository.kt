package com.codarchy.data.repository

import com.codarchy.data.mapping.toAgeEstimation
import com.codarchy.data.network.AgeApi
import com.codarchy.data.model.AgeEstimation
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AgeRepository @Inject constructor(private val api: AgeApi) {
    suspend fun requestAgeEstimation(name: String): AgeEstimation = api.getAgeEstimation(name).toAgeEstimation()
}
