package com.sammyg.myapp

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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Email
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
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun register() {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        var fullname by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var username by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var confirmpassword by remember { mutableStateOf("") }
        Text(
            text = "REGISTER",
            color = Color.Blue,
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
        )
        Spacer(modifier = Modifier.height(20.dp))
        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = "logo",
            modifier = Modifier
                .size((250.dp))
                .clip(RectangleShape),
        )
        Text(
            text = "Don't have an account? Register here:",
            color = Color.Blue,
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold
        )
        OutlinedTextField(
            value=fullname,
            onValueChange = {fullname=it},
            label = {Text(text="Full Name")},
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start=20.dp, end = 20.dp),
            leadingIcon = {
                Icon(imageVector = Icons.Default.AccountBox,
                    contentDescription = "person icon")
            }
        )
        OutlinedTextField(
            value=email,
            onValueChange = {email=it},
            label = {Text(text="Email address")},
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start=20.dp, end = 20.dp),
            leadingIcon = {
                Icon(imageVector = Icons.Default.Email,
                    contentDescription = "email icon")
            }
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
                    contentDescription = "pass.conf")
            }
        )
        OutlinedTextField(
            value=confirmpassword,
            onValueChange = {confirmpassword=it},
            label = {Text(text="Confirm Password")},
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
            Text("register",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }
        TextButton(onClick = {}){
            Text("Already have an account? Login here",
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun registerpreview(){
    register()
}
