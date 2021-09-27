package com.vettons.consumerapp.modules.auth.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.vettons.consumerapp.R
import com.vettons.consumerapp.ui.theme.AppconsumerTheme

@Composable
fun WelcomeScreen(navController: NavController) {
    Scaffold() {
        Column(
            Modifier.background(color = Color.Gray),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(horizontalArrangement = Arrangement.End, modifier = Modifier.fillMaxWidth()) {
                TextButton(onClick = { /*TODO*/ }) {
                    Text(text = "Explore Now")
                }
            }

            Spacer(modifier = Modifier.height(60.dp))
            Image(
                painter = painterResource(R.drawable.ic_vettons),
                contentDescription = "testing",
                modifier = Modifier.size(200.dp)
            )
            Text(text = "Welcome to Vettons")

            Spacer(modifier = Modifier.weight(1.0f))

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 15.dp)
            ) {
                Text(text = "Continue with email")
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(text = "or connect with")

            Spacer(modifier = Modifier.height(16.dp))

            Row() {
                SocialButton(painterResource(R.drawable.ic_google)) { /*TODO*/ }
                Spacer(modifier = Modifier.width(24.dp))
                SocialButton(painterResource(R.drawable.ic_apple)) { /*TODO*/ }
            }

            Spacer(modifier = Modifier.height(20.dp))
        }
    }
}

@Composable
fun SocialButton(painter: Painter, onClick: () -> Unit) {
    OutlinedButton(
        onClick = onClick,
        modifier = Modifier.size(50.dp),  //avoid the oval shape
        shape = CircleShape,
    ) {
        Image(
            painter = painter,
            contentDescription = "testing",
            modifier = Modifier
                .size(30.dp)
                .background(color = Color.White, shape = CircleShape)
                .clip(CircleShape)
        )
    }
}

@Preview
@Composable
fun WelcomeScreenPreview() {
    AppconsumerTheme {
        WelcomeScreen(rememberNavController())
    }
}