package com.sammyg.myapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.sammyg.myapp.R

@Composable
fun login(navController: NavController) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        var username by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        Text(
            text = "LOGIN",
            color = Color.Blue,
            fontSize = 60.sp,
            fontWeight = FontWeight.Bold,
        )
        Spacer(modifier = Modifier.height(20.dp));
        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = "logo",
            modifier = Modifier
                .size((250.dp))
                .clip(CircleShape),
        )
        Text(
            text = " Enter your login credentials:",
            color = Color.Blue,
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold
        )
        OutlinedTextField(
            value=username,
            onValueChange = {username=it},
            label = {Text(text="Username")},
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start=20.dp, end = 20.dp),
            leadingIcon = {
                Icon(imageVector = Icons.Default.Person,
                    contentDescription = "user icon")
            }
        )
        OutlinedTextField(
            value=password,
            onValueChange = {password=it},
            label = {Text(text="Password")},
            singleLine = true,
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start=20.dp, end = 20.dp),
            leadingIcon = {
                Icon(imageVector = Icons.Default.Lock,
                    contentDescription = "pass")
            }
        )
        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Green,
                contentColor = Color.Blue
                )
        ) {
            Text("login",
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp
            )
        }
        TextButton(onClick = {}){
            Text("Don't have an account? Register here",
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun loginpreview(){
    val mockNavController = rememberNavController()
    login(navController = mockNavController)
}