package com.example.storev2.HomePage.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.storev2.R

@Composable
fun ItemCard(
    Title:String,
    Image:Int,
    modifier: Modifier=Modifier
){
    Card (
        shape = RoundedCornerShape(15),
        colors = CardDefaults.cardColors(colorResource(R.color.CardColor)),
        elevation = CardDefaults.cardElevation(5.dp),
        modifier = modifier
            .fillMaxWidth()
            .padding(40.dp)

    ) {
        Box (
            Modifier
                .height(248.dp)
        ) {
                Image(
                    painter = painterResource(Image),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .fillMaxSize()
                )
            Box (
                Modifier
                    .fillMaxSize()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.White.copy(alpha = 0.9f),
                            ),
                            startY = 490f
                        )
                    ).blur(50.dp)
            )
            Box (
                Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Text(
                    Title,
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 18.sp
                    )
                )
            }
        }
    }
}
@Preview(device = "id:pixel_7")
@Composable
fun ItemCardPreview(modifier: Modifier=Modifier){
    Box  (
        Modifier.fillMaxSize().background(Color.White)
    ) {
        ItemCard("Wirless Headsets",R.drawable.headset)
    }
}
@Preview(device = "spec:parent=pixel_7,orientation=landscape")
@Composable
fun ItemCardPreviewlan(modifier: Modifier=Modifier){
    Box  (
        Modifier.fillMaxSize().background(Color.White)
    ) {
        ItemCard("Wirless Headsets",R.drawable.headset)
    }
}