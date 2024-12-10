package com.example.jetpackproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum

class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}

@Composable
fun Greeting(name: String) {
    Text(text="Hello $name")
}


@Preview(showSystemUi = true, device = Devices.PIXEL_7_PRO)
@Composable
private fun GreetingPreview() {
    Greeting(LoremIpsum(words = 10).values.joinToString(""))
}