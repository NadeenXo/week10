package com.example.tomandjerry.composable.jerrystore

data class TomCardData(
    val imageResId: Int,
    val title: String,
    val description: String,
    val cheeseAmount: String,
    val discount: String = ""
)