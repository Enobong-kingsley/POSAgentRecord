package com.chuks.posagentrecord


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.chuks.posagentrecord.databinding.FragmentSignupscreenBinding


/**
 * A simple [Fragment] subclass.
 */
class signupscreen : Fragment() {
    lateinit var binding : FragmentSignupscreenBinding
    var TAG : String = "Signupscreen"

        override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
            binding = DataBindingUtil.inflate(inflater, R.layout.fragment_signupscreen,
                container, false)
            (activity as AppCompatActivity?)?.setSupportActionBar(binding.myToolbar)
            binding.myToolbar.navigationIcon = ContextCompat.getDrawable(requireContext(), R.drawable.ic_arrow_back)
            binding.myToolbar.setBackgroundColor( ContextCompat.getColor(requireContext(), R.color.colorWhite))
            binding.myToolbar.setTitleTextColor( ContextCompat.getColor(requireContext(), R.color.colorGrey))
            binding.myToolbar.title = "Signup"

            binding.myToolbar.setNavigationOnClickListener {
                it.findNavController().popBackStack()
//                it.findNavController().navigate(R.id.viewTransactionsAction)
            }
            return binding.root
    }


}
