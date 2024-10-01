package com.example.storev2.HomePage.Data

import com.example.storev2.R

data class Categories(
    val id: String,
    val catName: String,
    val catImage: Int
)
data class SubCategory(
    val name: String,
    val price: Double,
    val image: Int,
    val description: String
)
var ListOfCategories = listOf(
    Categories("0", "All", R.drawable.all),
    Categories("1", "Laptops", R.drawable.laptops),
    Categories("2", "Smart Phones", R.drawable.smartphone),
    Categories("3", "Smart Watches", R.drawable.smartwatch),
    Categories("4", "Tablets", R.drawable.tablet),
    Categories("5", "Head Phones", R.drawable.headphones),
    Categories("6", "Cameras", R.drawable.camera),
    Categories("7", "Monitors", R.drawable.monitors),
    Categories("8", "Printers", R.drawable.printer),
    Categories("9", "Gaming Consoles", R.drawable.game),
    Categories("10", "Smart Home Devices", R.drawable.smart),
    Categories("11", "Accessories", R.drawable.acc)
)
val Listoflaptops = listOf(
    SubCategory("Gaming Laptop", 1299.99, R.drawable.headset, "High performance gaming laptop."),
    SubCategory("Ultrabook", 899.99, R.drawable.headset, "Lightweight and powerful ultrabook."),
    SubCategory("2-in-1 Laptop", 749.99, R.drawable.headset, "Versatile 2-in-1 laptop."),
    SubCategory("Business Laptop", 999.99, R.drawable.headset, "Perfect for business professionals."),
    SubCategory("Budget Laptop", 399.99, R.drawable.headset, "Affordable laptop for everyday use.")
)
