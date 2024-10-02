package com.example.storev2.HomePage.Components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.storev2.HomePage.Data.ListOfCategories


@Composable
fun ShowItems(modifier: Modifier = Modifier) {
    val index= (0..4).random()
    LazyColumn(modifier = modifier) {
        item {
            HomeTopBar()
            TitleComponent()
            Spacer(Modifier.height(30.dp))
            SearchComponent()
            Spacer(Modifier.height(35.dp))
            DisplayCatrgories()
        }
        items(ListOfCategories) { item ->
            ItemCard(item.subCategories[index].name,item.subCategories[index].image)
//                    println("item is ${item.subCategories[1].name}")
//                    println("item is ${item.subCategories[1].image}")
        }
    }
}