package com.example.cartaodeaniversario

import android.graphics.fonts.FontFamily
import android.icu.text.ListFormatter.Width
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCompositionContext
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartaodeaniversario.ui.theme.CartaoDeAniversarioTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartaoDeAniversarioTheme {
                Cartaodevisita()


            }
        }
    }
}
@Preview (showSystemUi = true)
@Composable
fun Cartaodevisita() {
    Box {
        Image(
            painter = painterResource(id = R.drawable.img_1),
            contentDescription =null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize(),
            alpha =0.9F
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),

            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                painter = painterResource(id = R.drawable.pexels_lumn_406014),
                contentDescription = null,
                modifier = Modifier
                    .size(200.dp)

            )
            Dois(text = "Samuel carlos Santos ")
            Tres(text = "cartão de visita")

        }
        }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),

                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center){
                    Image(
                        painter = painterResource(id = R.drawable.numero1),
                        contentDescription = null,
                        modifier = Modifier
                            .size(50.dp)
                            .align(Alignment.CenterVertically)

                    )
                    Um("55+ (11)99980 4195")
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.numero2),
                        contentDescription = null,
                        modifier = Modifier
                            .size(50.dp)
                            .align(Alignment.CenterVertically))
                    Um("@samuleiss")
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly,
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.numero3),
                        contentDescription = null,
                        modifier = Modifier
                            .size(50.dp)
                            .align(Alignment.CenterVertically)
                    )
                    Um(text = "mukkai.s@hotmail.com")
                }
            }
        }




    }


@Composable
fun Um(text:String){
    Text(
        text = text,
        fontSize = 18.sp,
        fontFamily = androidx.compose.ui.text.font.FontFamily.Serif,
        color = Color.White,
        textAlign = TextAlign.Center,
        modifier = Modifier.width(200.dp)

    )
}
@Composable
fun Dois(text:String){
    Text(
        text = text,
        fontSize = 36.sp,
        fontFamily = androidx.compose.ui.text.font.FontFamily.Serif,
        color = Color.White,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(end = 8.dp)
    )
}
@Composable
fun Tres(text:String){
    Text(
        text = text,
        fontSize = 30.sp,
        fontFamily = androidx.compose.ui.text.font.FontFamily.Serif,
        color = Color.White,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(end = 8.dp)
    )
}