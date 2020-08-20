package com.chuks.posagentrecord


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.chuks.posagentrecord.databinding.FragmentLoginscreenBinding

/**
 * A simple [Fragment] subclass.
 */
class LoginScreen : Fragment() {

    private lateinit var binding: FragmentLoginscreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_loginscreen,
            container, false)

        (activity as AppCompatActivity?)?.setSupportActionBar(binding.myToolbar)
        binding.myToolbar.navigationIcon = ContextCompat.getDrawable(requireContext(), R.drawable.ic_arrow_back)
        binding.myToolbar.setBackgroundColor( ContextCompat.getColor(requireContext(), R.color.colorWhite))
        binding.myToolbar.setTitleTextColor( ContextCompat.getColor(requireContext(), R.color.colorGrey))
        binding.myToolbar.title = getString(R.string.String)

        binding.myToolbar.setNavigationOnClickListener {
            it.findNavController().popBackStack()
        }
        binding.LoginBt.setOnClickListener {startActivity(Intent(context, HomeHostActivity::class.java))}
        return binding.root

    }
}