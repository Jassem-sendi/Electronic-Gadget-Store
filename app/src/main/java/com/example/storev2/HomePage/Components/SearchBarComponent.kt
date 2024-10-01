package com.example.storev2.HomePage.Components
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Close
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.storev2.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchComponent(modifier: Modifier = Modifier) {
    var text by rememberSaveable { mutableStateOf("") }
    var active by rememberSaveable { mutableStateOf(false) }
    val items = remember { mutableStateListOf<String>() }
    SearchBar(
        query = text ,
        onQueryChange = {
            text = it
        } ,
        active = active ,
        onSearch = {
            active = false
            items.add(text)
        } ,
        onActiveChange = {
            active = it
        } ,
        placeholder = {
            Text("Search for Item ..")
        } ,
        leadingIcon = {
            Icon(
                imageVector = Icons.Outlined.Search ,
                contentDescription = null
            )
        } ,
        trailingIcon = {
            if (active) {
                Icon(
                    imageVector = Icons.Outlined.Close ,
                    contentDescription = null ,
                    modifier = Modifier.clickable {
                        if (text.isNotEmpty()) {
                            text = ""
                        } else {
                            active = false
                        }
                    }
                )
            }
        } ,
        colors = SearchBarDefaults.colors(
            colorResource(R.color.SearchColor)
        ) ,
        windowInsets = WindowInsets(bottom = 100.dp) ,
        modifier = modifier
            .fillMaxWidth()
            .heightIn(max=500.dp)
            .then(
                if (!active) Modifier.padding(horizontal = 40.dp)
                else Modifier
            )

    )
    {
        items.forEach {
            Row(modifier = Modifier.padding(14.dp)) {
                Icon(
                    modifier = Modifier.padding(end = 10.dp) ,
                    imageVector = Icons.Default.Search ,
                    contentDescription = null
                )
                Text(it)
            }
        }
    }
}

