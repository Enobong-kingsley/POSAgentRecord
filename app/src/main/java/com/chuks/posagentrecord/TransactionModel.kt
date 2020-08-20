package com.chuks.posagentrecord

class TransactionModel(
    val transactionType : String,
    val chargeType : String,
    val transactionFee : Double,
    val amountCharged : Double
)