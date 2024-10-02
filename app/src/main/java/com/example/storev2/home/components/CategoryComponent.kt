package com.example.storev2.home.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun CategoryComponent(
    catName: String ,
    catImage: Int ,
    isSelected: Boolean ,
    modifier: Modifier = Modifier ,
    onClick: () -> Unit
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally ,
        modifier = modifier
            .clickable {
                onClick()
            }
            .width(62.dp)
//            .height(87.dp)
    ) {
        Box(
            modifier = Modifier
                .background(
                    if (isSelected)
                        Color.Black
                    else
                        Color.White
                )
                .padding(10.dp)
            // Todo: fixed bounds
            // dynamic bg color depending on selection
        ) {
            Image(
                painter = painterResource(catImage) ,
                contentDescription = null ,
                modifier = Modifier
                    .width(38.dp)
                    .height(31.dp)
            )
        }

        Spacer(Modifier.height(8.dp))

        Text(
            catName ,
            fontSize = 15.sp ,
            textAlign = TextAlign.Center ,
            maxLines = 2 ,
            overflow = TextOverflow.Ellipsis
        )
    }
}
