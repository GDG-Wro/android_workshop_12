package com.example.androidworkshop12.ui.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.androidworkshop12.R
import com.example.androidworkshop12.repository.NumberRepository
import kotlinx.android.synthetic.main.main_fragment.*
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.ext.scope

class FirstFragment : Fragment(R.layout.main_fragment) {

    companion object {
        fun newInstance() = FirstFragment()
    }

    private val viewModel: MainViewModel by viewModel()
    private val repository: NumberRepository by lazy { requireActivity().scope.get() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModelName.text = "First fragment"
        viewModelText.text = "ViewModel: ${viewModel.getNumber()}"
        repositoryText.text = "Repository: ${repository.number}"
    }
}
