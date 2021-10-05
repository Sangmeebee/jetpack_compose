package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.Purple200
import com.example.myapplication.ui.theme.Purple500

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .verticalScroll(ScrollState(0))
                    .fillMaxSize()
                    .background(color = Purple500)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.happy_meal), contentDescription = "happy meal",
                    modifier = Modifier
                        .height(300.dp)
                        .fillMaxWidth(), contentScale = ContentScale.Crop
                )

                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "Happy Meal", style = TextStyle(
                            fontSize = 26.sp
                        )
                    )
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(text = "800 Calories", style = TextStyle(fontSize = 17.sp))
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(text = "$5.99", style = TextStyle(color = Purple200, fontSize = 17.sp))
                }
            }
        }
    }
}
