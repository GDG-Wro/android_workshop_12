package com.example.androidworkshop12.ui.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.androidworkshop12.R
import com.example.androidworkshop12.activityComponent
import com.example.androidworkshop12.repository.NumberRepository
import kotlinx.android.synthetic.main.main_fragment.*
import javax.inject.Inject
import javax.inject.Named

class FirstFragment : Fragment(R.layout.main_fragment) {

    companion object {
        fun newInstance() = FirstFragment()
    }

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel: MainViewModel by viewModels { viewModelFactory }

    @Inject
    @Named("activity")
    lateinit var repository: NumberRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityComponent.inject(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModelName.text = "First fragment"
        viewModelText.text = "ViewModel: ${viewModel.getNumber()}"
        repositoryText.text = "Repository: ${repository.number}"
    }
}
