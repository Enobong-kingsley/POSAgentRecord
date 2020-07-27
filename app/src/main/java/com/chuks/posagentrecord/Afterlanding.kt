package com.chuks.posagentrecord


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil.setContentView


import com.chuks.posagentrecord.databinding.FragmentAfterlandingBinding

/**
 * A simple [Fragment] subclass.
 */
class Afterlanding : Fragment() {
    private lateinit var binding: FragmentAfterlandingBinding

//    override fun onCreateView(
//
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        return inflater.inflate(R.layout.fragment_afterlanding, container, false)
//    }

    override fun onCreateView(savedInstanceState: Bundle?) {
        title = "DashBoard"
        super.onCreate(savedInstanceState)
        binding = FragmentAfterlandingBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


}