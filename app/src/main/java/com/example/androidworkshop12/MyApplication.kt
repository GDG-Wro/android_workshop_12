package com.example.androidworkshop12

import android.app.Application
import android.content.Context
import androidx.fragment.app.Fragment
import com.example.androidworkshop12.di.AppComponent
import com.example.androidworkshop12.di.DaggerAppComponent

class MyApplication : Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .application(this)
            .build()
    }
}

val Context.appComponent get() = (applicationContext as MyApplication).appComponent

val Fragment.appComponent get() = requireContext().appComponent
