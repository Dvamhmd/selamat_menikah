package com.example.selamatmenikah

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.selamatmenikah.ui.theme.SelamatMenikahTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SelamatMenikahTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    IsiText(
                        "~Selamat Menikah~",
                        pasangan = "Pusparani &\n       Valentino",
                        doa = "Semoga keidupan pernikahan\nkalian bahagia & langgeng",
                        salam = "Salam,",
                        admirer = "Dava",
                    )
                }
            }
        }
    }
}

@Composable
fun IsiText(pesan: String, pasangan: String, doa: String, salam: String, admirer: String){

    Surface(
        color = Color.White
    ) {
        Image(
            painter = painterResource(id = R.drawable.sky_7232494_1920),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            alpha = 0.7F
        )

        Column(
            verticalArrangement = Arrangement.Center,
        ) {
            Text(
                text = pesan,
                color = Color.Black,
                fontSize = 28.sp,
                fontFamily = FontFamily.Serif,
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .heightIn(min = 50.dp)

                )
            Box (
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .heightIn(min = 50.dp)
            ){

                Image(
                    painter = painterResource(id = R.drawable.frame_6622874_1280),
                    contentDescription = "",
                )
                Column (
                    modifier = Modifier.align(alignment = Alignment.TopCenter)
                ){
                    Text(
                        text = pasangan,
                        color = Color.Magenta,
                        fontSize = 76.sp,
                        style = TextStyle(
                            shadow = Shadow(
                                color = Color.DarkGray,
                                offset = Offset(5.0f, 10.0f),
                                blurRadius = 7f
                            )
                        ),
                        lineHeight = 80.sp,
                        fontFamily = FontFamily.Cursive,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier
                            .heightIn(min = 220.dp)
                    )
                    Text(
                        text = doa,
                        color = Color.Black,
                        fontSize = 18.sp,
                        fontFamily = FontFamily.Serif,
                        lineHeight = 30.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
                    )
                }
            }

        }
    }
    Column(
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier
            .padding(8.dp)
    ){
        Text(
            text = salam,
            fontSize = 24.sp,
            fontFamily = FontFamily.Serif,
            color = Color.Black,
            modifier = Modifier.align(alignment = Alignment.End)
        )
        Text(
            text = admirer,
            fontSize = 50.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Black,
            modifier = Modifier.align(alignment = Alignment.End)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SelamatMenikahTheme {
        IsiText(
            "~Selamat Menikah~",
            pasangan = "Pusparani &\n     Valentino",
            doa = "Semoga keidupan pernikahan\nkalian bahagia & langgeng",
            salam = "Salam,",
            admirer = "Dava",
        )
    }
}