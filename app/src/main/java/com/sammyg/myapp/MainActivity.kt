package com.sammyg.myapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
        }
    }
}

@Composable
fun Greeting() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)  // Background color
            .padding(16.dp),  // Padding around the content
        verticalArrangement = Arrangement.SpaceEvenly,  // Space items evenly
        horizontalAlignment = Alignment.CenterHorizontally  // Center horizontally
    ) {
        Text(
            text = "Hello, welcome to my app",
            color = Color.Gray,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )

        Spacer(modifier = Modifier.height(16.dp))  // Space between the text and buttons

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,  // Space buttons evenly across the row
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(onClick = { /* Handle left click */ }) {
                Text(text = "Left")
            }
            Button(onClick = { /* Handle middle click */ }) {
                Text(text = "Middle")
            }
            Button(onClick = { /* Handle another middle click */ }) {
                Text(text = "Another Middle")
            }
            Button(onClick = { /* Handle right click */ }) {
                Text(text = "Right")
            }
        }
    }
}

@Composable
fun example(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Yellow)
    ){
        Image(
            painter = painterResource(id = R.drawable.render),
            contentDescription = "profile"
        )
        Text(
            text = "Overlay Text"
        )
    }
}

@Composable
fun counterexample(){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Red),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        //State is the data that changes over time in your app
        //MutableStateOf() - used to store values that change
        var count by remember { mutableStateOf(0) }
        Text(
            text="counter is $count",
            color = Color.Blue,
            fontWeight = FontWeight.Bold
        )
        Button(onClick = {count++}){
            Text("CLICK ME")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Greeting()
}