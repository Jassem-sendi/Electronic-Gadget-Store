package com.example.storev2.categorie.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.storev2.home.data.filter

@Composable
fun NavigationMenu(
    modifier: Modifier = Modifier ,
    selectedItem: String ,
    onClick: (String) -> Unit
) {
    Row(
        horizontalArrangement = Arrangement.SpaceAround ,
        modifier = modifier
            .fillMaxWidth()
    ) {
        filter.forEachIndexed() { index , item ->
            Text(
                text = item ,
                style = if (selectedItem == item) {
                    TextStyle(
                        textDecoration = TextDecoration.Underline,
                        color = Color.Black,
                        fontWeight = FontWeight.ExtraBold
                    )
                } else {
                    TextStyle(
                        textDecoration = TextDecoration.None,


                    )
                }
,
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .clickable {
                        onClick(item)
                    }

            )
        }
    }
}

