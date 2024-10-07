package com.example.storev2.Navigation
import kotlinx.serialization.Serializable

object Routes {
    @Serializable
    object HomeScreen
    @Serializable
    data class CategorieScreen(
        val id: String,
    )
@Serializable
    data class ProductScreen(
        val name: String,
    )

}
