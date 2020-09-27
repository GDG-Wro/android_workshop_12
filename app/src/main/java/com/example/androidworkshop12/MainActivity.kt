package com.example.androidworkshop12

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.androidworkshop12.di.ActivityComponent
import com.example.androidworkshop12.ui.main.FirstFragment
import com.example.androidworkshop12.ui.main.SecondFragment
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : AppCompatActivity() {

    lateinit var activityComponent: ActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        activityComponent = appComponent.activityComponent()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            showFragment(FirstFragment.newInstance())
        }
        firstFragment.setOnClickListener { showFragment(FirstFragment.newInstance()) }
        secondFragment.setOnClickListener { showFragment(SecondFragment.newInstance()) }
    }

    private fun showFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commitNow()
    }
}

val Fragment.activityComponent get() = (requireActivity() as MainActivity).activityComponent
