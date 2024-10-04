package com.example.storev2.home.components


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.storev2.Navigation.Routes
import com.example.storev2.home.data.Categories
import com.example.storev2.home.data.ListOfCategories
import kotlinx.coroutines.delay

@Composable
fun ShowCategories(
    navController: NavController,
    selectedCategoryId: String,
    onCategoryClicked: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier) {
        Text(
            text = "Categories" ,
            fontSize = 24.sp ,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 40.dp)
        )
        Spacer(Modifier.height(40.dp))
        LazyRow(

        ) {
            items(ListOfCategories) { item: Categories ->
                Category(
                    onClick = {
                        onCategoryClicked(item.id)
                            navController.navigate(Routes.CategorieScreen(
                                item.id
                            ))
                    },
                    catName = item.catName ,
                    catImage = item.catImage ,
                    isSelected = selectedCategoryId == item.id,
                    modifier = Modifier
                        .padding(horizontal = 8.dp)
                )
            }
        }
    }

}
