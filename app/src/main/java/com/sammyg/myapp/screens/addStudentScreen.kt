package com.sammyg.myapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import com.sammyg.myapp.screens.dropdownmenucomponent
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.sammyg.myapp.screens.addstudentScreen
import kotlin.String



@Composable
fun dropdownmenucomponent(
    label: String,
    options: List<String>,
    selectedOption: String,
    onOptionSelected: (String) -> Unit,
){
    var expanded by remember { mutableStateOf(false) }
    OutlinedTextField(
        value = selectedOption,
        onValueChange = {},
        readOnly = true,
        label = {Text(label)},
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
        trailingIcon = {
            Icon(
                imageVector = Icons.Default.ArrowDropDown,
                contentDescription = null,
                modifier = Modifier.clickable{expanded=!expanded}
            )
            DropdownMenu(
                expanded=expanded,
                onDismissRequest={expanded = false}
            ) {
                options.forEach{
                        option ->
                    DropdownMenuItem(
                        text = {Text(option)},
                        onClick = {
                            onOptionSelected(option)
                            expanded = false
                        }
                    )
                }
            }
        }

    )
}

@Composable
fun addstudentScreen(navController: NavController) {
    Scaffold(
        topBar = { TopBar("ADD STUDENT") },
        bottomBar = { BottomNav(navController) }
    ) { innerpadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerpadding),
        )
        {
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
                var selectedCourse by remember { mutableStateOf("") }
                var selectedGender by remember { mutableStateOf("") }
                OutlinedTextField(
                    value = fullname,
                    onValueChange = { fullname = it },
                    label = { Text("Full Name") },
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(20.dp))
                OutlinedTextField(
                    value = age,
                    onValueChange = { age = it },
                    label = { Text("AGE") },
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth(),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    )
                )
                Spacer(modifier = Modifier.height(20.dp))
                //course dropdown menu
                dropdownmenucomponent(
                    label = "SELECT COURSE",
                    options = listOf("FULLSTACK", "CYBERSECURITY", "DATA SCIENCE"),
                    selectedOption = selectedCourse,
                    onOptionSelected = { selectedCourse = it }
                )

                //gender dropdown menu
                Spacer(modifier = Modifier.height(20.dp))
                //course dropdown menu
                dropdownmenucomponent(
                    label = "SELECT GENDER",
                    options = listOf("MALE", "FEMALE"),
                    selectedOption = selectedGender,
                    onOptionSelected = { selectedGender = it }
                )
                //submit button

                Button(onClick = {}, modifier = Modifier.fillMaxWidth()) {
                    Text("ADD STUDENT")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun addstudentpreview(){
    val mockNavController = rememberNavController()
    addstudentScreen(navController = mockNavController)
}