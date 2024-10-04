package com.example.storev2.product_info


import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.storev2.home.data.ListOfProducts
import com.example.storev2.product_info.component.ButtonCustom

import com.example.storev2.product_info.component.Description
import com.example.storev2.product_info.component.TechInfo
import com.example.storev2.product_info.component.TopBar


@Composable
fun ProductDetails(
    navController: NavController,
    name: String,
    modifier: Modifier=Modifier
){
    val product=ListOfProducts.first(){
        it.name==name
    }


    Column (
        modifier
            .windowInsetsPadding(WindowInsets.systemBars)
            .verticalScroll(rememberScrollState())
            .fillMaxSize()


    ) {
        TopBar(navController,product.image)
        Spacer(Modifier.height(26.dp))
        Description(
            product.name,
            product.price,
            product.description
        )
        Spacer(Modifier.height(30.dp))
        TechInfo()
        Spacer(Modifier.height(35.dp))
        ButtonCustom()
        Spacer(Modifier.height(26.dp))
    }
}

































@Preview(device = "id:pixel_8_pro")
@Composable
fun ProductDetailsPreview(modifier: Modifier=Modifier){
    Box (
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
      //  ProductDetails()
    }
}
@Preview(device = "spec:parent=pixel_8_pro,orientation=landscape")
@Composable
fun ProductDetailsPreviewLan(modifier: Modifier=Modifier){
    Box (
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
       // ProductDetails()
    }
}