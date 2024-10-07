package com.example.storev2

import HomeScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
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
                    navController = navConroler ,
                    startDestination = Routes.HomeScreen
                ) {
                    composable<Routes.HomeScreen> {
                        HomeScreen() {
                            navConroler.navigate(
                                Routes.CategorieScreen(it)
                            )
                        }
                    }
                    composable<Routes.CategorieScreen> {
                        val arg = it.toRoute<Routes.CategorieScreen>()
                        CategoriePage(
                            arg.id ,
                            comeBack = {
                                navConroler.popBackStack()
                            }
                        ) {
                            navConroler.navigate(
                                Routes.ProductScreen(it)
                            )
                        }
                    }
                    composable<Routes.ProductScreen> {
                        val arg = it.toRoute<Routes.ProductScreen>()
                        ProductDetails(arg.name) {
                            navConroler.popBackStack()
                        }
                    }

                }

            }
        }
    }
}


