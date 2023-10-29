package com.withjetpack.lazycolumnjetpacocompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NormalLazycolumn(list: List<String>) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(space = 8.dp)
    ) {

        item {

            Text(text = "Country List", fontSize = 20.sp)
            Spacer(modifier = Modifier.height(8.dp))

        }

        items(items = list) { item ->
            Text(text = item, fontSize = 16.sp)
            Spacer(modifier = Modifier.height(height = 4.dp)) // a margin of 4 dp
            Divider()
        }

    }
}