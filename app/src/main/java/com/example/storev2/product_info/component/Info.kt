package com.example.storev2.product_info.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.storev2.R

@Composable
fun Info(
    Image:Int,
    Title:String,
    modifier: Modifier=Modifier
){
    Column (
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier=modifier
            .width(70.dp)
    ) {
        Icon(
            painter = painterResource(Image),
            contentDescription = null,
            modifier=Modifier
        )
        Spacer(Modifier.height(10.dp))
        Text(
            text = Title,
            style = TextStyle(
                fontSize = 10.sp,
                fontWeight = FontWeight(400) ,
                lineHeight = 16.sp,
                textAlign = TextAlign.Center
            ) ,
            color = Color.Black.copy(0.5f),
            modifier = Modifier
               // .widthIn(max =70.dp )

        )
    }
}


@Preview(device = "id:pixel_7_pro")
@Composable
fun InfoPreview(modifier: Modifier=Modifier){
    Box (
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        //Info()
    }
}
@Preview(device = "spec:parent=pixel_7_pro,orientation=landscape")
@Composable
fun InfoPreviewland(modifier: Modifier=Modifier){
    Box (
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
       // Info()
    }
}