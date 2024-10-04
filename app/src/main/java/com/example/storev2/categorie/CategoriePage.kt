package com.example.storev2.categorie

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.storev2.R
import com.example.storev2.categorie.component.NavigationMenu
import com.example.storev2.categorie.component.ProductCard
import com.example.storev2.categorie.component.ShowProducts
import com.example.storev2.home.data.Categories
import com.example.storev2.home.data.ListOfCategories
import com.example.storev2.home.data.ListOfProducts
import com.example.storev2.home.data.filter


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoriePage(
    navController: NavController,
    CategorieId:String,
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
    val Categorie= ListOfCategories.first() {
        it.id==CategorieId
    }
    Scaffold(
        modifier = Modifier
            .nestedScroll(scrollBehavior.nestedScrollConnection)
            .padding(20.dp),
        topBar = {
            MediumTopAppBar(
                title = {
                    Text(
                        Categorie.catName,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    scrolledContainerColor = Color.White,
                    containerColor =  Color.White,
                ) ,
                navigationIcon = {
                    IconButton(onClick = {
                        navController.popBackStack()
                    }) {
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
        var selectedMenuName by rememberSaveable { mutableStateOf("new") }
        var selected by rememberSaveable { mutableStateOf("new") }
        Column (
            modifier = modifier
                .background(Color.White)
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Spacer(Modifier.height(30.dp))
            NavigationMenu(
                selectedItem = selected,
                onClick = {
                    selectedMenuName=it
                    selected=selectedMenuName
                }

          )
            Spacer(Modifier.height(34.dp))
            ShowProducts(navController,grid,Categorie.id)
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
//            CategoriePage("10")
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