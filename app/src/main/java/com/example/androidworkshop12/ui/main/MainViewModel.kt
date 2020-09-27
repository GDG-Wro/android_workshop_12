package com.example.androidworkshop12.ui.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.androidworkshop12.repository.NumberRepository

class MainViewModel @ViewModelInject constructor(
    private val repository: NumberRepository,
) : ViewModel() {

    fun getNumber() = repository.number
}
