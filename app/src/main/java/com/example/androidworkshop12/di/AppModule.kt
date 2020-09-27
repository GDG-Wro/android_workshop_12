package com.example.androidworkshop12.di

import com.example.androidworkshop12.repository.NumberRepository
import com.example.androidworkshop12.repository.RandomNumberRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface AppModule {
    @Binds
    fun bindNumberRepository(randomNumberRepository: RandomNumberRepository): NumberRepository
}
