package com.example.storev2.categorie.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.storev2.R
import com.example.storev2.home.data.Product

@Composable
fun ProductCard(
    product: Product,
    modifier: Modifier=Modifier
    ){
    Card (
        colors = CardDefaults.cardColors(
            colorResource(R.color.ProductColor)
        ),
        shape = RoundedCornerShape(30.dp) ,
        modifier=modifier
            .padding(21.dp)
            .width(164.dp)
            .height(244.dp)
            .clickable {  }
    ){
        Image(
            painter = painterResource(product.image),
            contentScale = ContentScale.Fit,
            contentDescription = null,
            modifier = Modifier
                .height(186.dp)
                .fillMaxWidth()
        )
        Text(
            text = product.name,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            color = Color.Black.copy(alpha = 0.5f),
            maxLines = 1,
            style = TextStyle(
                fontWeight = FontWeight(400),
                fontSize = 18.sp
            ),
            modifier = Modifier
                .fillMaxWidth()
        )
        Text(
            text = "$"+product.price.toString(),
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            color = Color.Black,
            style = TextStyle(
                fontWeight = FontWeight(500),
                fontSize = 16.sp
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp, bottom = 12.dp)
        )
    }
    }
@Preview
@Composable
fun ProductCardPreview(){
    Box (
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        ProductCard(     Product("Windows Tafdgdfgfdgblet", 699.99, R.drawable.tabletimage, "Tablet with full Windows OS.", "4"),)
    }
}