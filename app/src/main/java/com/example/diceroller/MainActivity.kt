package com.example.diceroller

import android.media.Image
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.widget.AppCompatTextView
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.diceroller.ui.theme.DiceRollerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiceRollerTheme {
                DiceRollerApp()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DiceRollerApp(){
    DiceWithButtonAndImage(modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center))
}


@Composable
fun DiceWithButtonAndImage(modifier: Modifier = Modifier){

    Column(modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally){

        Image(
            painter = painterResource(R.drawable.composecamp_logo),
            contentDescription = "Compose Camp Logo"
        )

        Text(text="Dipayan Sarkar", color = Color(56,112,179,255), fontSize = 30.sp,fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "❤️",
            fontSize = 24.sp,
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text="Jetpack Compose", color = Color(8,48,66,255), fontSize = 30.sp,fontWeight = FontWeight.Bold)
    }
}
