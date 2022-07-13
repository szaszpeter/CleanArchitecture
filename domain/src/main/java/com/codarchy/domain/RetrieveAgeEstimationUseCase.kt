package com.codarchy.domain

import com.codarchy.data.repository.AgeRepository
import javax.inject.Inject

class RetrieveAgeEstimationUseCase @Inject constructor(private val repository: AgeRepository){

    suspend operator fun invoke() = with(String) {
        repository.requestAgeEstimation(this.toString())
    }
}
