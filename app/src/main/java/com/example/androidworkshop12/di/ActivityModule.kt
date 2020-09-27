package com.example.androidworkshop12.di

import com.example.androidworkshop12.repository.NumberRepository
import com.example.androidworkshop12.repository.RandomNumberRepository
import dagger.Binds
import dagger.Module
import javax.inject.Named
import javax.inject.Qualifier

@Module
interface ActivityModule {
    @Binds
    @Named("activity")
    @ActivityScope
    fun bindNumberRepository(randomNumberRepository: RandomNumberRepository): NumberRepository
}
