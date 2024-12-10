package com.example.jetpackproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum

/** No need to extend AppCompatActivity as
 * backward compatibility (material design / top & bottom bar)
 * redundant for compose
 *
 * Jetpack Compose is a library and taken care at build time
 */
class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /** Content block - Composable Scope with root Composable (lambda)
         * reference to parent composable can also be passed
         * - ReComposer (though not required)
         */
        setContent {
            /**
             * Composable can run in any order
             * though currently run on single thread but in future
             * can support multithreading
             */
            Greeting("Jetpack Compose!")
        }
    }
}

/**
 * Normal Kotlin functions with Composable annotation
 * Must be in CamelCase though (Noun / Adjective + Noun)
 * Must return Unit
 */
@Composable
fun Greeting(name: String) {
    Text(text="Hello $name")
}


/**
 * Preview can either be used with
 * 1. No parameters
 * 2. Parameters with default values
 * 3. Factory method for parameters values -> @PreviewParameter
 */
@Preview(showSystemUi = true, device = Devices.PIXEL_7_PRO)
@Composable
private fun GreetingPreview() {
    /**
     * LoremIpsum a useful utility for previews 
     */
    Greeting(LoremIpsum(words = 10).values.joinToString(""))
}