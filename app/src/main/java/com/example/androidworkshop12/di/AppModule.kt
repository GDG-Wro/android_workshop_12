package com.example.androidworkshop12.di

import com.example.androidworkshop12.MainActivity
import com.example.androidworkshop12.repository.NumberRepository
import com.example.androidworkshop12.repository.RandomNumberRepository
import com.example.androidworkshop12.ui.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.bind
import org.koin.dsl.module
import org.koin.experimental.builder.scoped

val appModule = module {
    factory<NumberRepository> { RandomNumberRepository() }
    viewModel { MainViewModel(get()) }
    scope<MainActivity> {
        scoped<RandomNumberRepository>() bind NumberRepository::class
    }
}
