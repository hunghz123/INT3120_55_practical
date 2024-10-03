package com.example.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonade.ui.theme.LemonadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonadeTheme {
                LemonApp()
            }
        }
    }
}

@Composable
fun LemonApp() {

    var currentStep by remember { mutableStateOf(1) }

    var squeezeCount by remember { mutableStateOf(0) }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        when (currentStep) {
            1 -> {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ){
                    Spacer(modifier = Modifier.height(32.dp))
                    Image(
                        painter = painterResource(R.drawable.lemon_tree),
                        contentDescription = stringResource(R.string.lemon_text_1),
                        modifier = Modifier
                            .wrapContentSize()
                            .padding(bottom = 16.dp)
                            .border(
                                width = 2.dp,
                                color = Color(red = 145, green = 205, blue = 216)
                            )
                            .background(color = Color(red = 145, green = 205, blue = 216))
                            .clickable {
                                currentStep = 2
                                squeezeCount = (2..4).random()
                            }
                    )
                    Text(
                        text = stringResource(R.string.lemon_tree_1),
                        fontSize = 18.sp
                    )
                }
            }
            2 -> {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ){
                    Spacer(modifier = Modifier.height(32
                        .dp))
                    Image(
                        painter = painterResource(R.drawable.lemon_squeeze),
                        contentDescription = stringResource(R.string.lemon_text_2),
                        modifier = Modifier
                            .wrapContentSize()
                            .padding(bottom = 16.dp)
                            .border(
                                width = 2.dp,
                                color = Color(red = 145, green = 205, blue = 216)
                            )
                            .background(color = Color(red = 145, green = 205, blue = 216))
                            .clickable {
                                squeezeCount--;
                                if (squeezeCount == 0)
                                    currentStep = 3
                            }
                    )
                    Text(
                        text = stringResource(R.string.lemon_tree_2),
                        fontSize = 18.sp
                    )
                }
            }
            3 -> {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ){
                    Spacer(modifier = Modifier.height(32.dp))
                    Image(
                        painter = painterResource(R.drawable.lemon_drink),
                        contentDescription = stringResource(R.string.lemon_text_3),
                        modifier = Modifier
                            .wrapContentSize()
                            .padding(bottom = 16.dp)
                            .border(
                                width = 2.dp,
                                color = Color(red = 145, green = 205, blue = 216)
                            )
                            .background(color = Color(red = 145, green = 205, blue = 216))
                            .clickable {
                                currentStep = 4
                            }
                    )
                    Text(
                        text = stringResource(R.string.lemon_tree_3),
                        fontSize = 18.sp
                    )
                }
            }
            4 -> {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ){
                    Spacer(modifier = Modifier.height(32.dp))
                    Image(
                        painter = painterResource(R.drawable.lemon_restart),
                        contentDescription = stringResource(R.string.lemon_text_4),
                        modifier = Modifier
                            .wrapContentSize()
                            .padding(bottom = 16.dp)
                            .border(
                                width = 2.dp,
                                color = Color(red = 145, green = 205, blue = 216)
                            )
                            .background(color = Color(red = 145, green = 205, blue = 216))
                            .clickable {
                                currentStep = 1
                            }
                    )
                    Text(
                        text = stringResource(R.string.lemon_tree_4),
                        fontSize = 18.sp
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LemonadeTheme {
        LemonApp()
    }
}