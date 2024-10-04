package com.example.storev2

import HomeScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.storev2.Navigation.Routes
import com.example.storev2.categorie.CategoriePage
import com.example.storev2.product_info.ProductDetails
import com.example.storev2.ui.theme.StoreV2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StoreV2Theme {
                val navConroler = rememberNavController()
                NavHost(
                    navController = navConroler,
                    startDestination = Routes.HomeScreen
                ) {
                    composable<Routes.HomeScreen> {
                        HomeScreen(navController = navConroler)
                    }
                    composable<Routes.CategorieScreen> {
                        val arg = it.toRoute<Routes.CategorieScreen>()
                        CategoriePage(navConroler,arg.id)
                    }
                    composable<Routes.ProductScreen> {
                        val arg = it.toRoute<Routes.ProductScreen>()
                        ProductDetails(navConroler,arg.name)
                    }

                }

            }
        }
    }
}

