package com.example.androidworkshop12.di

import com.example.androidworkshop12.repository.NumberRepository
import com.example.androidworkshop12.repository.RandomNumberRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named

@Module
@InstallIn(ActivityComponent::class)
interface ActivityModule {
    @Binds
    @Named("activity")
    @ActivityScoped
    fun bindNumberRepository(randomNumberRepository: RandomNumberRepository): NumberRepository
}
