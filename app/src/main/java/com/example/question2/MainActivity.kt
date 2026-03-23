package com.example.question2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.example.question2.ui.theme.Question2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Question2Theme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    TaskCompletedScreen()
                }
            }
        }
    }
}
@Composable
fun TaskCompletedScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_task_completed), // replace with your image name
            contentDescription = null
        )
        Text(
            text = stringResource(id = R.string.all_tasks_completed),
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = 24.dp, bottom = 8.dp)
        )
        Text(
            text = stringResource(id = R.string.nice_work),
            fontSize = 16.sp
        )
    }
}
@Preview(showBackground = true)
@Composable
fun TaskCompletedPreview() {
    Question2Theme {
        TaskCompletedScreen()
    }
}