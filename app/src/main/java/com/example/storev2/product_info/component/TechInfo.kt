package com.example.storev2.product_info.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.storev2.home.data.listoftechInfo

@Composable
fun TechInfo(modifier: Modifier=Modifier){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround,
        modifier=modifier
            .padding(horizontal = 19.dp)
            .fillMaxWidth()

    ) {
        listoftechInfo.forEach {
            item->
            Info(item.icon,item.description)
        }
    }
}

@Preview(device = "id:pixel_7_pro")
@Composable
fun TechInfoPreview(modifier: Modifier=Modifier){
    Box (
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        TechInfo()
    }
}
@Preview(device = "spec:parent=pixel_7_pro,orientation=landscape")
@Composable
fun TechInfoPreviewland(modifier: Modifier=Modifier){
    Box (
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        TechInfo()
    }
}