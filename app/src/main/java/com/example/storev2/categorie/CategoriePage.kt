package com.example.storev2.categorie

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.storev2.R
import com.example.storev2.categorie.component.ProductCard
import com.example.storev2.home.data.ListOfProducts
import com.example.storev2.home.data.filter


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoriePage(
    id:String,
    modifier: Modifier=Modifier
){
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(rememberTopAppBarState())
    var grid = 0
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            grid=3
        }
        else -> {
            grid=2
        }
    }
    Scaffold(
        modifier = Modifier
            .nestedScroll(scrollBehavior.nestedScrollConnection)
            .padding(20.dp),
        topBar = {
            MediumTopAppBar(
                title = {
                    Text(
                        "Medium Top App Bar",
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Localized description"
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            painter = painterResource(R.drawable.items) ,
                            contentDescription = "Localized description"
                        )
                    }
                },
                scrollBehavior = scrollBehavior
            )
        },
    ) { innerPadding ->
        Column (
            modifier = modifier
                .fillMaxSize()
                .padding(innerPadding)


        ) {
            Row (
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier
                    .fillMaxWidth()

            ) {
                filter.forEachIndexed(){
                        index,item->
                    Text(
                        text = item,
                        modifier=Modifier
                            .padding(horizontal = 20.dp)
                            .clickable {
                            }
                    )
                }
            }
            LazyVerticalGrid(
                columns = GridCells.Fixed(grid),
                modifier = Modifier
                    .fillMaxSize()
            ){
                items(ListOfProducts.filter { it.categoryId==id }){
                    item ->  ProductCard(item)
                }
            }
        }

    }
}



@Composable
@Preview(device = "id:pixel_7")
fun CategoriePagePreview(){
        Box (
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        ) {
            CategoriePage("11", )
        }
}
@Composable
@Preview(device = "spec:parent=pixel_7,orientation=landscape")
fun CategoriePagePreviewLand(){
    Box (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        //CategoriePage()
    }
}