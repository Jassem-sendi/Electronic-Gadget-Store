package com.example.storev2.categorie.component

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.storev2.home.data.ListOfProducts

@Composable
fun ShowProducts(
    gridCells: Int,
    id:String,
    modifier: Modifier=Modifier,
    onNavigate:(String)->Unit
){
    val product by remember { mutableStateOf(
        ListOfProducts.filter { it.categoryId==id }
    ) }
    LazyVerticalGrid(
        columns = GridCells.Fixed(gridCells),
        modifier = modifier
            .fillMaxSize()
    ){
        items(product){
                item ->  ProductCard(item){
                    onNavigate(
                        item.name
                    )
        }
        }
    }
}