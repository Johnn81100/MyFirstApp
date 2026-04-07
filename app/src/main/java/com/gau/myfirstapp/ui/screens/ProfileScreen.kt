package com.gau.myfirstapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Message
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.gau.myfirstapp.R
import com.gau.myfirstapp.ui.components.StandardButton

@Composable
fun ProfilePage() {
    val context = LocalContext.current
    Card(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.profile_pic),
                contentDescription = "Jonathan GAU",
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
                    .border(2.dp, Color.Gray, CircleShape),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "Développeur Android Senior",
                color = Color.Gray
            )
            Text(
                text = "Passionné par le dévelop" +
                        "" +
                        "pement mobile, j'aime créer des applications intuitives et performantes.",
                modifier = Modifier.padding(horizontal = 32.dp)
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Message, contentDescription = "Message")
                }
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Call, contentDescription = "Appeler")
                }
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Email, contentDescription = "Email")
                }
            }
            StandardButton(
                label = "Follow",
                onClick = {
                    Toast.makeText(context, "Merci !", Toast.LENGTH_SHORT).show()
                },
                containerColor = Color(0xFF6200EE)
            )
        }
    }
}