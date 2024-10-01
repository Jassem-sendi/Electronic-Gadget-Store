package com.example.storev2.HomePage

import androidx.compose.foundation.background
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
import com.example.storev2.HomePage.Components.DisplayCatrgories
import com.example.storev2.HomePage.Components.HomeTopBar
import com.example.storev2.HomePage.Components.SearchComponent
import com.example.storev2.HomePage.Components.ShowItems
import com.example.storev2.HomePage.Components.TitleComponent


@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .windowInsetsPadding(WindowInsets.systemBars)
//            .verticalScroll(rememberScrollState())
    ) {

        ShowItems()
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    Box(
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        HomeScreen()
    }
}

@Preview(device = "spec:parent=pixel_5,orientation=landscape")
@Composable
fun HomeScreenPreviewLand() {
    Box(
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        HomeScreen()
    }
}