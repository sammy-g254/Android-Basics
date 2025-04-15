package com.sammyg.myapp.screens



import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable
fun schoolDashboard(navController: NavController){
    Column (
        modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ){
        Text(
            text = "School system dashboard",
            style = MaterialTheme.typography.headlineLarge,
            color = Color.Blue
        )
        //Add cards
        DashboardCard(
            title="Teachers",
            description="Manage teachers",
            icon = Icons.Default.Person,
            onClick = {print("Teachers' card clicked")},
            backgroundColor=Color.Blue
        )
        DashboardCard(
            title="Students",
            description="Manage students",
            icon = Icons.Default.Person,
            onClick = {print("Students' card clicked")},
            backgroundColor=Color.Yellow
        )
    }
}

@Composable
fun DashboardCard(
    title: String,
    description: String,
    icon: ImageVector,
    onClick:()-> Unit,
    backgroundColor: Color
){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .clickable { onClick() },
        colors = CardDefaults.cardColors(containerColor = backgroundColor),
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(2.dp, Color.Black),  // Added border
        elevation = CardDefaults.cardElevation(8.dp)
    ){
    Row(
        modifier = Modifier
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
         //icon for the card
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier
                .size(40.dp)
                .padding(end = 16.dp),
            tint = Color.White
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(
                text = "Title",
                style = MaterialTheme.typography.headlineLarge,
                color = Color.White
            )
            Text(
                text = "Description",
                style = MaterialTheme.typography.headlineMedium,
                color = Color.White
            )
        }
    }}
}



@Preview
@Composable
fun dashboardpreview(){
    val mockNavController = rememberNavController()
    schoolDashboard(navController = mockNavController)
}