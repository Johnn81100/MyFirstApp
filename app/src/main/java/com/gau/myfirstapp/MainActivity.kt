package com.gau.myfirstapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.gau.myfirstapp.ui.components.StandardButton
import com.gau.myfirstapp.ui.screens.ProfilePage
import com.gau.myfirstapp.ui.theme.MyFirstAppTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyFirstAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    ProfilePage()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    val context = LocalContext.current
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Bienvenue dans mon cours Android!")
        StandardButton(
            label = "clik me!",
            onClick = {
                Toast.makeText(context, createWelcomeMessage("Jonathan"), Toast.LENGTH_SHORT).show()
            }
        )
    }
}

fun createWelcomeMessage(name: String, year: Int = 2026): String {
    return "Bienvenue $name nous sommes $year "
}