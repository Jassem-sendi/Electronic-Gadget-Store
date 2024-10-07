package com.example.storev2.home.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorFilter.Companion.tint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.storev2.R


@Composable
fun Category(
    catName: String ,
    catImage: Int ,
    isSelected: Boolean ,
    modifier: Modifier = Modifier ,
    onClick:  () -> Unit
) {


    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(10.dp),
        modifier=modifier
            .clickable {
                onClick()
            }
    ) {
        Box (
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .clip(RoundedCornerShape(10))
                .background(
                    if (isSelected){
                        colorResource(R.color.SelectedCat)
                    }
                    else{
                        colorResource(R.color.CatergorieColor)
                    }
                )
                .width(66.dp)
                .height(62.dp)
                .padding(15.dp)
        ){
            Image(
                painter = painterResource(catImage),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                colorFilter = remember {
                    tint(
                        if (isSelected)
                            Color.White
                        else
                            Color.Black
                    )
                },
               modifier = Modifier.fillMaxSize()
            )
        }
        Spacer(Modifier.height(10.dp))
        Text(
            text = catName,
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
            maxLines =2 ,
            overflow = TextOverflow.Ellipsis,
            modifier=Modifier.widthIn(max = 70.dp)
        )
    }
}

@Preview
@Composable
fun CategoryPreview (){
    Box ( Modifier
        .fillMaxSize()
        .background(Color.White)
    ) {
        Category(
            catName = "Laptops",
            catImage = R.drawable.alliconcat,
            isSelected = false,
            modifier = Modifier,
            onClick = {}
        )
    }
}
@Preview(device = "spec:parent=pixel_5,orientation=landscape")
@Composable
fun CategoryPreviewLand (){
    Box ( Modifier
        .fillMaxSize()
        .background(Color.White)
    ) {
        Category(
            catName = "Laptops",
            catImage = R.drawable.alliconcat,
            isSelected = true,
            modifier = Modifier,
            onClick = {}
        )
    }
}