package com.chuks.posagentrecord


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chuks.posagentrecord.databinding.FragmentDashboardBinding

/**
 * A simple [Fragment] subclass.
 */
class Dashboard : Fragment() {
    lateinit var binding : FragmentDashboardBinding
    val TAG : String = "Dashboard"


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_dashboard, container, false)

        binding.calendar.setOnClickListener {
            // implement the calendar. Onclick it opens up calendar
//            Toast.makeText(requireContext(), Toast.LENGTH_LONG).show()
            Log.d(TAG, "onCreateView: You clicked calendar")
             }

        binding.csv.setOnClickListener {
            // implement the calendar. Onclick it opens up calendar
            Log.d(TAG, "onCreateView: You clicked csv")
        }

        binding.transactionRecyclerview.setHasFixedSize(true)
        val dashboardAdapter  = context?.let { DashboardAdapter(it) }
       binding.transactionRecyclerview.adapter = dashboardAdapter
        binding.transactionRecyclerview.layoutManager = LinearLayoutManager(context)
        dashboardAdapter?.setData(transactionData())
        return binding.root
    }

    fun transactionData() : ArrayList<TransactionModel>{
        val list = ArrayList<TransactionModel>()
        list.add(TransactionModel("Transfer", "Pos", 23.0, 150.0))
        list.add(TransactionModel("Withdrawal", "Cash", 23.0, 200.0))
        list.add(TransactionModel("Transfer", "Pos", 23.0, 200.0))
        list.add(TransactionModel("Withdrawal", "Cash", 23.0, 150.0))
        list.add(TransactionModel("Transfer", "Pos", 23.0, 200.0))
        list.add(TransactionModel("Withdrawal", "Cash", 23.0, 150.0))
        list.add(TransactionModel("Transfer", "Pos", 23.0, 200.0))
        list.add(TransactionModel("Withdrawal", "Cash", 23.0, 150.0))
        return list
    }


}
