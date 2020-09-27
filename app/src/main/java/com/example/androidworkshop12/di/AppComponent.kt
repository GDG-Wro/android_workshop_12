package com.example.androidworkshop12.di

import androidx.lifecycle.ViewModelProvider
import com.example.androidworkshop12.MyApplication
import com.example.androidworkshop12.ui.main.SecondFragment
import dagger.BindsInstance
import dagger.Component


@Component(modules = [AppModule::class, ViewModelModule::class])
interface AppComponent {
    fun viewModelFactory(): ViewModelProvider.Factory
    fun inject(fragment: SecondFragment)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: MyApplication): Builder

        fun build(): AppComponent
    }
}
