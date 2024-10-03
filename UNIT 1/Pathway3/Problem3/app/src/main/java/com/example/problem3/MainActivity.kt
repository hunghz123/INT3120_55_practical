package com.example.problem3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.problem3.ui.theme.Problem3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Problem3Theme {

            }
        }
    }
}

@Composable
fun Solve() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            Quater1(Modifier.weight(1f))
            Quater2(Modifier.weight(1f))
        }
        Row(Modifier.weight(1f)) {
            Quater3(Modifier.weight(1f))
            Quater4(Modifier.weight(1f))
        }
    }
}

@Composable
fun Quater1(modifier: Modifier = Modifier) {
    Column (
        Modifier
            .fillMaxSize()
            .background(color = Color(0xFFEADDFF))
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Text composable",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = stringResource(R.string.text2_quarter1),
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun Quater2(modifier: Modifier = Modifier) {
    Column (
        Modifier
            .fillMaxSize()
            .background(color = Color(0xFFD0BCFF))
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Image composable",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = stringResource(R.string.text2_quarter2),
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun Quater3(modifier: Modifier = Modifier) {
    Column (
        Modifier
            .fillMaxSize()
            .background(color = Color(0xFFB69DF8))
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Row composable",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = stringResource(R.string.text2_quarter3),
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun Quater4(modifier: Modifier = Modifier) {
    Column (
        Modifier
            .fillMaxSize()
            .background(color = Color(0xFFF6EDFF))
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Column composable",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = stringResource(R.string.text2_quater4),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Problem3Theme {
        Solve()
    }
}