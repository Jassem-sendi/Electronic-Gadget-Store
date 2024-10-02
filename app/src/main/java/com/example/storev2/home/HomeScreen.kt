package com.example.storev2.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.storev2.home.components.ItemCardComponent
import com.example.storev2.home.components.SearchBarComponent
import com.example.storev2.home.components.ShowCategoriesComponent
import com.example.storev2.home.components.TitleComponent
import com.example.storev2.home.components.TopBarComponent
import com.example.storev2.home.data.ListOfCategories
import com.example.storev2.home.data.ListOfProducts
import com.example.storev2.home.data.Product
import kotlinx.coroutines.delay


@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    var allProducts by remember {
        mutableStateOf(emptyList<Product>())
    }

    var selectedCategoryId  by remember { mutableStateOf("1") }

//    val items = ListOfCategories[selectedCategoryId.toInt()-1]
    val products by remember(
        allProducts,
        selectedCategoryId,
    ) {
        mutableStateOf(allProducts.filter { it.categoryId == selectedCategoryId })
    }

    LaunchedEffect(Unit) {
        delay(2000)
        allProducts = ListOfProducts
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .windowInsetsPadding(WindowInsets.systemBars)
    ) {
        LazyColumn(modifier = Modifier) {
            item {
                TopBarComponent()
                TitleComponent()
                Spacer(Modifier.height(30.dp))
                SearchBarComponent()
                Spacer(Modifier.height(35.dp))
                ShowCategoriesComponent(
                    selectedCategoryId = selectedCategoryId,
                    onCategoryClicked = { categoryId ->
                        selectedCategoryId = categoryId
                    }
                )
            }

            items(products) { item ->
                ItemCardComponent(
                    item.name,
                    item.image
                )
            }
        }
    }
}

