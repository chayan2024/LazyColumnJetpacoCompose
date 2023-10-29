package com.withjetpack.lazycolumnjetpacocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.withjetpack.lazycolumnjetpacocompose.ui.theme.LazyColumnJetpacoComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumnJetpacoComposeTheme {
                // A surface container using the 'background' color from the theme
                val list= listOf("India","US","UK","Canada")
               NormalLazycolumn(list)
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LazyColumnJetpacoComposeTheme {
        Greeting("Android")
    }
}