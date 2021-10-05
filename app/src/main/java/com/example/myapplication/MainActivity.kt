package com.example.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = "Kim Sangmin")
                Spacer(modifier = Modifier.padding(top = 10.dp))
                Button(
                    onClick = { Toast.makeText(baseContext, "my name is Kim sangmin", Toast.LENGTH_SHORT).show() }
                ) {
                    Text(text = "show Toast")
                }
            }
        }
    }
}
