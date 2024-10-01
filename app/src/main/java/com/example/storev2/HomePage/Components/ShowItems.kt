package com.example.storev2.HomePage.Components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.storev2.HomePage.Data.Listoflaptops

@Composable
fun ShowItems(modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        item {
            HomeTopBar()
            TitleComponent()
            Spacer(Modifier.height(30.dp))
            SearchComponent()
            Spacer(Modifier.height(35.dp))
            DisplayCatrgories()
        }
        items(Listoflaptops) { item ->
            ItemCard(item.name , item.image)
        }
    }
}