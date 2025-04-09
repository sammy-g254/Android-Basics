package com.sammyg.myapp

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MainAppScreen(){
    Scaffold (
        bottomBar = {

        }
    ){}
}

@Preview(showBackground=true)
@Composable
fun mainpreview() {
    MainAppScreen()
}