package com.example.storev2.home.components


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.storev2.R


@Composable
fun TitleComponent (modifier: Modifier=Modifier){
    // Todp
    Text(
        text = "Hey, buy the best Electronic Gadgets",
        fontSize = 30.sp,
        fontFamily = FontFamily(Font(R.font.ubuntu_medium)) ,
        textAlign = TextAlign.Start,
        lineHeight = 39.sp ,
        modifier= modifier
            .padding(start =40.dp)
            .fillMaxWidth()
    )

}
@Preview
@Composable
fun TitleComponentPreview (){
    Box ( Modifier
        .fillMaxSize()
        .background(Color.White)
    ) {
        TitleComponent()
    }
}
@Preview(device = "spec:parent=pixel_5,orientation=landscape")
@Composable
fun TitleComponentPreviewLand (){
    Box ( Modifier
        .fillMaxSize()
        .background(Color.White)
    ) {
        TitleComponent()
    }
}