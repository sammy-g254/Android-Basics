package com.sammyg.myapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun addstudentScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color(0xFF3FF4F6)),
    ) {
        Text(
            text = "Add new student",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.headlineLarge
        )
        var fullname by remember { mutableStateOf("") }
        var age by remember { mutableStateOf("") }
        val courses = listOf("Cybersecurity","Full Stack","Data Science")
        val genders = listOf("Male","Female")
        OutlinedTextField(
            value=fullname,
            onValueChange = {fullname=it},
            label = {Text{"Full Name"}},
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
        )

    }
}

@Preview(showBackground=true)
@Composable
fun addstudentpreview{
    addstudentScreen()
}