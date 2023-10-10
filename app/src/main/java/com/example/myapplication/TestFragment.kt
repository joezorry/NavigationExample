package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.TestFragmentViewBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class TestFragment: Fragment(R.layout.test_fragment_view) {

    @Inject
    lateinit var analyticsService: AnalyticsService

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = TestFragmentViewBinding.bind(view)
        binding.fragmentButton.setOnClickListener {
            analyticsService.sendAnalytics()
        }
    }
}
