package com.example.storev2.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.storev2.R

@Composable
fun HomeTopBar(
    modifier: Modifier = Modifier ,
    onClick:()->Unit

    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween ,
            modifier = modifier
                .fillMaxWidth()
                .padding(36.dp)
        ) {
            IconButton(
                onClick=onClick
            ) {
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

