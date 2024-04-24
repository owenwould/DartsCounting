package com.example.dartscounting

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults

import androidx.compose.material3.Text

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.unit.dp
import com.example.dartscounting.ui.theme.DartsCountingTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			DartsCountingTheme { // A surface container using the 'background' color from the theme
				
				Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
					Button(
						modifier = Modifier
							.height(40.dp)
							.width(140.dp),
						enabled = true,
						elevation = ButtonDefaults.buttonElevation(defaultElevation = 30.dp),
						colors = ButtonDefaults.buttonColors(
							containerColor = Color(red = 163, green = 124, blue = 240)
						),
						onClick = { }) {
						Text("Checkouts")
					}
				}
				
			}
		}
	}
}



