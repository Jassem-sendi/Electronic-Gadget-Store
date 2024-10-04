package com.example.storev2.categorie.component

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.storev2.home.data.ListOfProducts

@Composable
fun ShowProducts(
    navController:NavController,
    gridCells: Int,
    id:String,
    modifier: Modifier=Modifier
){
    LazyVerticalGrid(
        columns = GridCells.Fixed(gridCells),
        modifier = modifier
            .fillMaxSize()
    ){
        items(ListOfProducts.filter { it.categoryId==id }){
                item ->  ProductCard(navController = navController,item)
        }
    }
}