package com.example.storev2.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.storev2.R
import com.example.storev2.home.data.ListOfCategories
import kotlinx.coroutines.launch

@Composable
fun TopBar(
    modifier: Modifier = Modifier ,
    onClick:()->Unit

    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween ,
            modifier = modifier
                .fillMaxWidth()
                .padding(36.dp)
        ) {
            IconButton(onClick = {
                    onClick()
            }) {
                Icon(
                    painter = painterResource(R.drawable.menuicon) ,
                    contentDescription = null ,
                    modifier = Modifier
                        .width(32.dp)
                        .height(34.dp)
                )
            }
            IconButton(onClick = {
            }) {
                Icon(
                    imageVector = Icons.Filled.AccountCircle ,
                    contentDescription = null ,
                    modifier = Modifier
                        .width(50.dp)
                        .height(50.dp)
                )
            }
        }
    }
//}
