package com.example.starbucks.data

import com.example.starbucks.R
import com.example.starbucks.model.Menu

object MenuRepository {
    val drinks = listOf(
        Menu(
            nameRes = R.string.drink_1_name,
            priceRes = R.string.drink_1_price,
            imageRes = R.drawable.menua
        ),
        Menu(
            nameRes = R.string.drink_2_name,
            priceRes = R.string.drink_2_price,
            imageRes = R.drawable.menub
        ),
        Menu(
            nameRes = R.string.drink_3_name,
            priceRes = R.string.drink_3_price,
            imageRes = R.drawable.menuc
        ),
        Menu(
            nameRes = R.string.drink_4_name,
            priceRes = R.string.drink_4_price,
            imageRes = R.drawable.menud
        ),
        Menu(
            nameRes = R.string.drink_5_name,
            priceRes = R.string.drink_5_price,
            imageRes = R.drawable.menue
        ),
        Menu(
            nameRes = R.string.drink_6_name,
            priceRes = R.string.drink_6_price,
            imageRes = R.drawable.menuf
        )
    )
}