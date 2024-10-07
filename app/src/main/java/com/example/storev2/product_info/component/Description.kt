package com.example.storev2.product_info.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Description(
    name:String,
    price:Double,
    description:String,
    modifier: Modifier=Modifier
){
    Column (
        horizontalAlignment = Alignment.Start,
        modifier =  modifier
            .fillMaxWidth()
            .padding(42.dp)
    ) {
        Text(
            text = name,
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                lineHeight = 27.58.sp
            )
        )
        Spacer(Modifier.height(10.dp))
        Text(
            text = "\$"+price,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                lineHeight = 22.98.sp
            )
        )
        Spacer(Modifier.height(32.dp))
        Text(
            text = description,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight(400),
                lineHeight = 22.98.sp
            ),
            color = Color.Black.copy(0.5f)
        )

    }
}




@Preview(device = "id:pixel_7_pro")
@Composable
fun DescriptionPreview(modifier: Modifier=Modifier){
    Box (
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        //Description()
    }
}
@Preview(device = "spec:parent=pixel_7_pro,orientation=landscape")
@Composable
fun DescriptionPreviewland(modifier: Modifier=Modifier){
    Box (
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        //Description()
    }
}