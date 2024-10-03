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
import com.example.storev2.Navigation.Routes
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
                            HomeScreen(navConroler)
                        }
                }

            }
        }
    }
}

