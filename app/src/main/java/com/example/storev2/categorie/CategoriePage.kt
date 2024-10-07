package com.example.storev2.categorie

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.storev2.R
import com.example.storev2.categorie.component.NavigationMenu
import com.example.storev2.categorie.component.ShowProducts
import com.example.storev2.home.data.ListOfCategories


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoriePage(
    categorieId: String ,
    modifier: Modifier = Modifier,
    comeBack:()->Unit,
    onNavigate:(String)->Unit
) {
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(rememberTopAppBarState())
    var grid by remember { mutableIntStateOf(0) }
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            grid = 3
        }

        else -> {
            grid = 2
        }
    }
    val categories by remember {
        mutableStateOf(ListOfCategories.first() {
            it.id == categorieId
        })
    }
    Scaffold(
        modifier = Modifier
            .nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            MediumTopAppBar(
                title = {
                    Text(
                        categories.catName ,
                        maxLines = 1 ,
                        overflow = TextOverflow.Ellipsis
                    )
                } ,
                colors = TopAppBarDefaults.topAppBarColors(
                    scrolledContainerColor = Color.White ,
                    containerColor = Color.White ,
                ) ,
                navigationIcon = {
                    IconButton(onClick = {
                        comeBack()
                    }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack ,
                            contentDescription = "Localized description"
                        )
                    }
                } ,
                actions = {
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            painter = painterResource(R.drawable.items) ,
                            contentDescription = "Localized description"
                        )
                    }
                } ,
                scrollBehavior = scrollBehavior
            )
        } ,
    ) { innerPadding ->
        var selectedMenuName by rememberSaveable { mutableStateOf("new") }

        Column(
            modifier = modifier
                .background(Color.White)
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Spacer(Modifier.height(30.dp))
            NavigationMenu(
                selectedItem = selectedMenuName ,
                onClick = {
                    selectedMenuName = it
                }

            )
            Spacer(Modifier.height(34.dp))
            ShowProducts(grid,categories.id){
                onNavigate(it)
            }
        }
    }
}

