package com.codarchy.domain

import com.codarchy.data.model.AgeEstimation
import com.codarchy.data.repository.AgeRepository
import javax.inject.Inject

class RetrieveAgeEstimationUseCase @Inject constructor(private val repository: AgeRepository){

    suspend operator fun invoke(name: String): AgeEstimation {
        return repository.requestAgeEstimation(name)
    }
}
