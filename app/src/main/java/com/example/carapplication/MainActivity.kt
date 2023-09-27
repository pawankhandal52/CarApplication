package com.example.carapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.carapplication.di.CarComponent
import com.example.carapplication.di.DaggerCarComponent
import com.example.carapplication.ui.theme.CarApplicationTheme

class MainActivity : ComponentActivity() {
    val component = DaggerCarComponent.builder().build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CarApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ShowCars(component)

                }
            }
        }

    }
}

@Composable
fun ShowCars(component: CarComponent) {
    Column {
        for (i in 1..10){
            val car = component.getCar()
            Greeting("${car.hashCode()}")
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Car hashcode $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CarApplicationTheme {
        Greeting("Android")
    }
}