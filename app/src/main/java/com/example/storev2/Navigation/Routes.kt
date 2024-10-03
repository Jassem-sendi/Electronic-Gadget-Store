package com.example.storev2.Navigation

import com.example.storev2.home.data.Product
import kotlinx.serialization.Serializable

class Routes {
    @Serializable
    object HomeScreen
    @Serializable
    data class CategorieScreen(
        val  CategorieId:String
    )
    data class ProductScreen(
        val Product :Product
    )

}
