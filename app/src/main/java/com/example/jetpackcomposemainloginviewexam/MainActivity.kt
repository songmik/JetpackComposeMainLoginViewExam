package com.example.jetpackcomposemainloginviewexam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposemainloginviewexam.ui.theme.JetpackComposeMainLoginViewExamTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeMainLoginViewExamTheme {
                LoginView()
            }
        }
    }
}

@Composable
fun LoginView() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(1f))
        LoginMiddleView()
        Spacer(modifier = Modifier.weight(1f))
        LoginBottomView()
    }
}

@Composable
fun LoginMiddleView() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.jc),
            contentDescription = "Middle Logo",
            modifier = Modifier.size(300.dp)
        )

        Text(
            text = "mimisongsong",
            textDecoration = TextDecoration.Underline,
            fontFamily = FontFamily.Monospace,
            fontSize = 20.sp
        )
    }
}

@Composable
fun LoginBottomView() {
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .padding(start = 20.dp, end = 20.dp),
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 2.dp
        ),
        shape = RoundedCornerShape(15.dp),
        colors = ButtonDefaults.buttonColors(
            Color.Black
        )
    ) {
        Icon(
            Icons.Default.Info,
            contentDescription = "Google Logo"
        )
        Spacer(modifier = Modifier.padding(5.dp))
        Text(text = "로그인 버튼입니다.")
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 15.dp, bottom = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row {
            LoginInfoText("위 버튼을 누르면 ", TextDecoration.None)
            LoginInfoText("서비스 이용약관", TextDecoration.Underline)
            LoginInfoText("과", TextDecoration.None)
        }
        Row {
            LoginInfoText("개인정보처리방침", TextDecoration.Underline)
            LoginInfoText("에 ", TextDecoration.None)
            LoginInfoText("동의하시게 됩니다.", TextDecoration.None)
        }
    }
}

@Composable
fun LoginInfoText(text: String, textDecoration: TextDecoration) {
    Text(
        text = text,
        fontSize = 12.sp,
        textDecoration = textDecoration,
        color = Color.Gray
    )
}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    LoginView()
}