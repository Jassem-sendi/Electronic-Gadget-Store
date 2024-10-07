package com.example.storev2.home.components


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.storev2.home.data.ListOfCategories
import kotlinx.coroutines.launch


@Composable
fun NavDrawer(
    modifier: Modifier = Modifier
) {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val selectedIndex by rememberSaveable {
        mutableStateOf(0)
    }
    ModalNavigationDrawer(
        modifier = modifier.fillMaxHeight(1f),
        drawerContent = {
            ModalDrawerSheet {
                ListOfCategories.forEachIndexed() { index , item ->
                    NavigationDrawerItem(
                        label = {
                            Text(item.catName)
                        } ,
                        selected = index == selectedIndex,
                        onClick = {
                            scope.launch {
                                drawerState.apply {
                                    if (isClosed) open() else close()
                                }
                            }
                        } ,
                        icon = {
                            Icon(
                                painter = painterResource(item.catImage) ,
                                contentDescription = null
                            )
                        }

                    )
                }
            }
        } ,
        drawerState = drawerState
    ) {
        HomeTopBar() {
            scope.launch {
                drawerState.apply {
                    if (isClosed) open() else close()
                }
            }
        }
    }
}

@Preview
@Composable
fun NavDrawerPreview(modifier: Modifier = Modifier) {
    Box(
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        NavDrawer()
    }
}