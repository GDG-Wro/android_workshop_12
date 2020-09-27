package com.example.androidworkshop12.di

import com.example.androidworkshop12.repository.NumberRepository
import com.example.androidworkshop12.repository.RandomNumberRepository
import dagger.Binds
import dagger.Module

@Module
interface AppModule {
    @Binds
    fun bindNumberRepository(randomNumberRepository: RandomNumberRepository): NumberRepository
}
