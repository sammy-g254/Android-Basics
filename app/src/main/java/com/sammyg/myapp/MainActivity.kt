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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign.Companion.Center
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.sammyg.myapp.screens.addstudentScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
        }
    }
}

@Composable
fun HomePage(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(MaterialTheme.colorScheme.primaryContainer, MaterialTheme.colorScheme.secondaryContainer)
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(Color.Black, Color.Blue)
                    )
                )
                .padding(32.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
        ){
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription="logo",
                modifier = Modifier
                    .size(170.dp)
                    .clip(RoundedCornerShape(4000.dp)),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(32.dp))
            Text(
                text = "Hello,Welcome To My Awesome App",
                style = TextStyle(
                    color=Color.Cyan,
                    fontFamily=FontFamily.SansSerif,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.ExtraBold,
                    textAlign=Center
                ),color = Color.Cyan,
                modifier = Modifier
                    .padding(bottom = 24.dp)
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(Color.Black, Color.Blue),
                        ),
                        shape = MaterialTheme.shapes.medium
                    )
                    .padding(16.dp)
                    .shadow(8.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Discover amazing features and enjoy your experience.",
                style = TextStyle(
                    color=Color.Cyan,
                    fontFamily=FontFamily.Cursive,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold,
                    textAlign=Center
                )

            )
            Spacer(modifier = Modifier.height(162.dp))
            Button(
                onClick = {navController.navigate("LoginPage")},
                modifier = Modifier
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF3498DB)),
                shape = RoundedCornerShape(28.dp)
            ) {
                Text(
                    "Get Started",
                    color = Color.White,
                    style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePagePreview() {
    val mockNavController = rememberNavController()
    HomePage(navController = mockNavController)
}