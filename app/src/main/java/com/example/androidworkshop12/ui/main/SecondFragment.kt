package com.example.androidworkshop12.ui.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.androidworkshop12.R
import com.example.androidworkshop12.repository.NumberRepository
import kotlinx.android.synthetic.main.main_fragment.*
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class SecondFragment : Fragment(R.layout.main_fragment) {

    companion object {
        fun newInstance() = SecondFragment()
    }

    private val viewModel: MainViewModel by viewModel()
    private val repository: NumberRepository by inject()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModelName.text = "Second fragment"
        viewModelText.text = "ViewModel: ${viewModel.getNumber()}"
        repositoryText.text = "Repository: ${repository.number}"
    }
}
