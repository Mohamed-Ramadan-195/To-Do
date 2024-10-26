package com.example.to_do.presentation.onboarding.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.to_do.R
import com.example.to_do.databinding.FragmentThirdScreenBinding
import com.example.to_do.util.onBoardingFinished

class ThirdScreenFragment : Fragment() {

    private var _binding: FragmentThirdScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentThirdScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        onClicks()
    }

    private fun onClicks() {
        binding.apply {
            getStartedButton.setOnClickListener {
                findNavController().navigate (
                    R.id.action_viewPagerFragment_to_homeActivity
                )
                onBoardingFinished()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}