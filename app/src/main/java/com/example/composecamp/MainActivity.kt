package com.example.composecamp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composecamp.ui.theme.ComposeCampTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCampTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                )
                {
                    Column(horizontalAlignment =Alignment.CenterHorizontally) {


                    ComposeCampWithImage()
                    ComposeCampWithText(message = "Kavya Chauhan")
                    ComposeCampWithImage1()
                    ComposeCampWithText1(text2 = "Jetpack Compose")
                }}
            }
        }
    }
}
@Composable
fun ComposeCampWithImage() {
    Image(painter = painterResource(id = R.drawable.composelogo), contentDescription = "image",
        modifier = Modifier
            .padding(start = 10.dp, top = 30.dp, end = 10.dp, bottom = 10.dp)
            .width(300.dp)
            .height(300.dp)
            .fillMaxWidth(),

        )
}
@Composable
fun ComposeCampWithText(message: String){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
    ) {

    Text(
        text = message,
        fontWeight = FontWeight.Bold,
        fontSize = 36.sp,
        color = Color(56, 112, 179, 255),
        textAlign = TextAlign.Center,
    )
    }
}
@Composable
fun ComposeCampWithImage1() {
    Image(painter = painterResource(id = R.drawable.heartlogo), contentDescription = "image",
        modifier = Modifier
            .padding(5.dp)
            .width(200.dp)
            .height(200.dp)
            .fillMaxWidth(),

        )
}

@Composable
fun ComposeCampWithText1(text2: String){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
    ) {

        Text(
            text = text2 ,
            fontWeight = FontWeight.Bold,
            fontSize = 36.sp,
            color = Color(8, 48, 66, 255),
            textAlign = TextAlign.Center,
        )
    }
}


@Preview(showBackground = true )
@Composable
fun ComposeCampPreview() {
    ComposeCampTheme {
        ComposeCampWithImage()
        ComposeCampWithText("Kavya Chauhan")
        ComposeCampWithImage1()
        ComposeCampWithText1(text2 = "Jetpack Compose")

    }
}