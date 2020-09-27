package com.example.androidworkshop12.di

import com.example.androidworkshop12.ui.main.FirstFragment
import dagger.Subcomponent
import javax.inject.Scope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class ActivityScope

@ActivityScope
@Subcomponent(modules = [ActivityModule::class])
interface ActivityComponent {
    fun inject(fragment: FirstFragment)
}
