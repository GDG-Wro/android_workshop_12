package com.example.androidworkshop12.ui.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.androidworkshop12.R
import kotlinx.android.synthetic.main.main_fragment.*

class SecondFragment : Fragment(R.layout.main_fragment) {

    companion object {
        fun newInstance() = SecondFragment()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModelName.text = "Second fragment"
        viewModelText.text = "ViewModel: TODO"
        repositoryText.text = "Repository: TODO"
    }
}
