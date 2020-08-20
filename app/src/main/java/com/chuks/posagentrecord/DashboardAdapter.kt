package com.chuks.posagentrecord

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.dashboard_list_item.view.*

class DashboardAdapter(val context : Context) : RecyclerView.Adapter<DashboardAdapter.DashboardViewHolder>() {
    var transactionItem  = ArrayList<TransactionModel>()

     class DashboardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

         fun bind(item : TransactionModel, context: Context){
             itemView.transaction_type_tv.text = item.transactionType.capitalize()
             itemView.charge_type.text = item.chargeType
             itemView.transaction_fee.text = item.transactionFee.toString()
             itemView.amount_charged.text = item.amountCharged.toString()

             if(itemView.transaction_type_tv.text == "Transfer"){
                 itemView.transaction_type_tv.setTextColor(ContextCompat.getColor(context, R.color.colorGreen))
                 itemView.box.setBackgroundColor(ContextCompat.getColor(context, R.color.colorGreen))
             }
         }
    }

    fun setData(listItem : ArrayList<TransactionModel>){
        this.transactionItem =listItem
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DashboardViewHolder {
       val view = LayoutInflater.from(context).inflate(R.layout.dashboard_list_item, parent, false)
        return DashboardViewHolder(view)
    }

    override fun onBindViewHolder(holder: DashboardViewHolder, position: Int) {
        holder.bind(transactionItem[position], context)
    }

    override fun getItemCount(): Int {
      return transactionItem.size
    }


}


