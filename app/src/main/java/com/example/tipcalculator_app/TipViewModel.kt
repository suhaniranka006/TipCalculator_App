package com.example.tipcalculator_app

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TipViewModel : ViewModel() {

    val costOfService = MutableLiveData<String>()

    private val _tipAmount = MutableLiveData<Double>()
    val tipAmount: LiveData<Double> get() = _tipAmount

    fun calculateTip() {
        val cost = costOfService.value?.toDoubleOrNull() ?: 0.0
        _tipAmount.value = cost * 0.15
    }
}

