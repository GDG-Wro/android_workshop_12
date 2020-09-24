package com.example.androidworkshop12.ui.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.androidworkshop12.R
import kotlinx.android.synthetic.main.main_fragment.*

class FirstFragment : Fragment(R.layout.main_fragment) {

    companion object {
        fun newInstance() = FirstFragment()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModelName.text = "First fragment"
        viewModelText.text = "ViewModel: TODO"
        repositoryText.text = "Repository: TODO"
    }
}
