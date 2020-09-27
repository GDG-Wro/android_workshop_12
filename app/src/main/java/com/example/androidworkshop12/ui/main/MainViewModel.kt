package com.example.androidworkshop12.ui.main

import androidx.lifecycle.ViewModel
import com.example.androidworkshop12.repository.NumberRepository
import javax.inject.Inject

class MainViewModel @Inject constructor(private val repository: NumberRepository) : ViewModel() {

    fun getNumber() = repository.number
}
