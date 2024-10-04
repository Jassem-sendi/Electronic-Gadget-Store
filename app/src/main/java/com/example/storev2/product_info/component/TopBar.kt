package com.example.storev2.product_info.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.storev2.R


@Composable
fun TopBar(
    navController: NavController,
    image:Int,
    modifier: Modifier=Modifier
){
    Column (
        modifier=modifier
            .background(colorResource(R.color.CatergorieColor).copy(alpha = 0.6f))
            .height(483.dp)
    ) {
        Row (
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically,
            modifier=Modifier
                .fillMaxWidth()

        ) {
            IconButton(onClick = {
                navController.popBackStack()
            }) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Localized description"
                )
            }
            Text(
                "About Product",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            IconButton(onClick = { /* do something */ }) {
                Icon(
                    painter = painterResource(R.drawable.items) ,
                    contentDescription = "Localized description"
                )
            }
        }
        Image(
            painter = painterResource(image),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .fillMaxSize()



        )
    }
}
@Preview(device = "id:pixel_7_pro")
@Composable
fun TopBarPreview(modifier: Modifier=Modifier){
    Box (
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
       // TopBar()
    }
}
@Preview(device = "spec:parent=pixel_7_pro,orientation=landscape")
@Composable
fun TopBarPreviewland(modifier: Modifier=Modifier){
    Box (
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        //TopBar()
    }
}