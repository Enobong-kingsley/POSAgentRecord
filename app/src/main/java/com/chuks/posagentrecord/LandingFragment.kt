package com.chuks.posagentrecord


import android.icu.lang.UCharacter.GraphemeClusterBreak.L
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.chuks.posagentrecord.databinding.FragmentLandingBinding

/**
 * A simple [Fragment] subclass.
 */
class LandingFragment : Fragment() {
private lateinit var binding : FragmentLandingBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_landing, container, false )
        binding.login.setOnClickListener { findNavController().navigate(R.id.addTransactionFragment) }
        binding.signup.setOnClickListener { findNavController().navigate(R.id.signupscreen) }
        return binding.root
    }



}
