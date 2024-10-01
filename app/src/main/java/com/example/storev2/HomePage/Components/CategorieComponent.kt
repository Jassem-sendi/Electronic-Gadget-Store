package com.example.storev2.HomePage.Components


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.storev2.HomePage.Data.Categories
import com.example.storev2.HomePage.Data.ListOfCategories
import com.example.storev2.R


@Composable
fun Categorie(
    catName: String ,
    catImage: Int ,
    modifier: Modifier = Modifier
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally ,
        modifier = modifier
            .clickable {


            }
            .width(62.dp)
            .height(87.dp)


    ) {
        Image(
            painter = painterResource(catImage) ,
            contentDescription = null ,
            modifier = Modifier

                .width(38.dp)
                .height(31.dp)
        )
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
