package com.example.storev2.product_info.component


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.storev2.R

@Composable
fun ButtonCustom(modifier: Modifier=Modifier){
  Button(
      onClick = {},
      colors = ButtonDefaults.buttonColors(colorResource(R.color.CardColor)),
      shape = RoundedCornerShape(15.dp) ,
      modifier = modifier
          .fillMaxWidth()
          .height(55.dp)
          .padding(horizontal = 40.dp)
  ) {
        Text(
            "Add To Card",
            fontSize = 16.sp,
            lineHeight = 18.38.sp,
            fontWeight = FontWeight(500)
        )
  }
}
@Preview(device = "id:pixel_7_pro")
@Composable
fun ButtonPreview(modifier: Modifier=Modifier){
    Box (
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        ButtonCustom()
    }
}
@Preview(device = "spec:parent=pixel_7_pro,orientation=landscape")
@Composable
fun ButtonPreviewland(modifier: Modifier=Modifier){
    Box (
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        ButtonCustom()
    }
}