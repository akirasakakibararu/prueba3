package com.example.examencompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.examencompose.ui.theme.ExamenComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExamenComposeTheme {
                vistaExamen()
            }
        }
    }
}

@Composable
fun vistaExamen() {

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Cyan)
            .padding(40.dp),
        verticalArrangement = Arrangement.Center
    ){
        Row (
            modifier = Modifier
                .background(color = Color.Gray)
                .padding(vertical = 40.dp)
                .fillMaxWidth()
        ){
            Column (

            ){
                texto("Hello Android!", Color.Red)
            }
            Column (
                modifier = Modifier
                    .weight(1f),
                horizontalAlignment = Alignment.End
            ){
                texto("Hello Android!", Color.Red)
                texto("Hello Android!", Color.Red)
                texto("Hello Android!", Color.Red)
            }
        }
        Row (
            modifier = Modifier
                .background(color = Color.White)
                .align(Alignment.CenterHorizontally)
                .padding(40.dp)
        ){
            texto("Hello Android!", Color.White)
        }
        Row (
            modifier = Modifier
                .background(color = Color.Green)
                .fillMaxWidth()
                .padding(horizontal = 15.dp)
        ){
            Column (
                modifier = Modifier
                    .background(color = Color.Blue)
                    .width(60.dp)
            ){
                boton(1)
                boton(2)
                boton(3)
            }

            Spacer(modifier = Modifier.width(15.dp))

            Column (
                modifier = Modifier
                    .background(color = Color.Magenta)
                    .wrapContentWidth(Alignment.CenterHorizontally)
                    .weight(1f),
            ){
                boton(4)
                boton(5)
                boton(6)
            }

            Spacer(modifier = Modifier.width(15.dp))

            Column (
                modifier = Modifier
                    .background(color = Color.Black)
                    .width(60.dp)
            ){
                boton(7)
                boton(8)
                boton(9)
            }
        }
    }
}

@Composable
fun boton (numero : Int) {
    Button(
        onClick = {},
        modifier = Modifier
            .size(60.dp),
        shape = CircleShape
    ) {
        Text(
            text = numero.toString()
        )
    }
}

@Composable
fun texto (mensaje: String, colorElegido : Color) {
    Text(
        text = mensaje,
        modifier = Modifier
            .background(colorElegido)
    )
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ExamenComposeTheme {
        vistaExamen()
    }
}