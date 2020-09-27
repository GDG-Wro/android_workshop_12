package com.example.androidworkshop12.ui.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.androidworkshop12.R
import com.example.androidworkshop12.repository.NumberRepository
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.main_fragment.*
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class FirstFragment : Fragment(R.layout.main_fragment) {

    companion object {
        fun newInstance() = FirstFragment()
    }

    private val viewModel: MainViewModel by viewModels()

    @Inject
    @Named("activity")
    lateinit var repository: NumberRepository

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModelName.text = "First fragment"
        viewModelText.text = "ViewModel: ${viewModel.getNumber()}"
        repositoryText.text = "Repository: ${repository.number}"
    }
}
