package com.example.tarjeta

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjeta.ui.theme.TarjetaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Init()
                }
            }
        }
    }
}

@Composable
fun Init(){
    Greeting(nombre = "Juanjo Eduardo", titulo = "El farlopa")
}

@Composable
fun Greeting(nombre: String, titulo: String, modifier: Modifier = Modifier) {

    Surface(
        color = Color(android.graphics.Color.parseColor("#d2e7d4"))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(top = (LocalConfiguration.current.screenHeightDp.dp / 2) - 160.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Surface(color = Color(android.graphics.Color.parseColor("#073042"))) {
                val image = painterResource(R.drawable.android_logo)
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier
                        .height(140.dp),
                )
            }
            Text(
                text = nombre,
                fontSize = 42.sp
                )
            Text(
                text = titulo,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(android.graphics.Color.parseColor("#167849"))
            )

            Row(
                modifier = Modifier
                    .padding(top = 200.dp)
                    .padding(top = 10.dp)
            ) {
                Icon(imageVector = rememberCall(), contentDescription = null)
                Text(
                    text = "+88 630 86 43 44",
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(horizontal = 4.dp)
                )
            }

            Row(
                modifier = Modifier
                    .padding(top = 10.dp)
            ) {
                Icon(imageVector = rememberShare(), contentDescription = null)
                Text(
                    text = "@LaAsignaturaDeInfoMovil",
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(horizontal = 4.dp)
                )
            }

            Row(
                modifier = Modifier
                    .padding(top = 10.dp)
            ) {
                Icon(imageVector = rememberMail(), contentDescription = null)
                Text(
                    text = "BingChilling@jijijija.com",
                    modifier = Modifier
                        .padding(horizontal = 4.dp),
                    fontSize = 20.sp
                )
            }



        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TarjetaTheme {
        Init()
    }
}


// tremenda apgina con iconos: https://www.composables.com/icons
@Composable
fun rememberCall(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "call",
            defaultWidth = 40.0.dp,
            defaultHeight = 40.0.dp,
            viewportWidth = 40.0f,
            viewportHeight = 40.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(32.958f, 34.708f)
                quadToRelative(-5.041f, 0f, -10.02f, -2.416f)
                quadToRelative(-4.98f, -2.417f, -8.896f, -6.354f)
                quadTo(10.125f, 22f, 7.688f, 17.062f)
                quadTo(5.25f, 12.125f, 5.25f, 7.042f)
                quadToRelative(0f, -0.75f, 0.521f, -1.271f)
                quadToRelative(0.521f, -0.521f, 1.271f, -0.521f)
                horizontalLineTo(13f)
                quadToRelative(0.583f, 0f, 1f, 0.375f)
                quadToRelative(0.417f, 0.375f, 0.542f, 1f)
                lineToRelative(1.125f, 5.333f)
                quadToRelative(0.083f, 0.542f, -0.042f, 1.021f)
                quadToRelative(-0.125f, 0.479f, -0.417f, 0.813f)
                lineToRelative(-4.083f, 4.083f)
                quadToRelative(2.167f, 3.583f, 4.937f, 6.354f)
                quadTo(18.833f, 27f, 22.375f, 29f)
                lineToRelative(3.958f, -4.042f)
                quadToRelative(0.375f, -0.375f, 0.875f, -0.562f)
                quadToRelative(0.5f, -0.188f, 1f, -0.063f)
                lineToRelative(5.125f, 1.084f)
                quadToRelative(0.625f, 0.125f, 1.021f, 0.604f)
                quadToRelative(0.396f, 0.479f, 0.396f, 1.104f)
                verticalLineToRelative(5.792f)
                quadToRelative(0f, 0.791f, -0.521f, 1.291f)
                quadToRelative(-0.521f, 0.5f, -1.271f, 0.5f)
                close()
                moveTo(9.833f, 15.458f)
                lineTo(13f, 12.25f)
                lineToRelative(-0.875f, -4.375f)
                horizontalLineTo(7.917f)
                quadToRelative(0.041f, 1.625f, 0.521f, 3.5f)
                quadToRelative(0.479f, 1.875f, 1.395f, 4.083f)
                close()
                moveToRelative(22.292f, 16.584f)
                verticalLineToRelative(-4.167f)
                lineTo(28f, 27f)
                lineToRelative(-3.167f, 3.25f)
                quadToRelative(1.667f, 0.75f, 3.563f, 1.229f)
                quadToRelative(1.896f, 0.479f, 3.729f, 0.563f)
                close()
                moveToRelative(-7.292f, -1.792f)
                close()
                moveToRelative(-15f, -14.792f)
                close()
            }
        }.build()
    }
}

@Composable
fun rememberShare(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "share",
            defaultWidth = 40.0.dp,
            defaultHeight = 40.0.dp,
            viewportWidth = 40.0f,
            viewportHeight = 40.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(30.125f, 36.417f)
                quadToRelative(-1.958f, 0f, -3.354f, -1.375f)
                quadToRelative(-1.396f, -1.375f, -1.396f, -3.334f)
                quadToRelative(0f, -0.291f, 0.063f, -0.666f)
                quadToRelative(0.062f, -0.375f, 0.187f, -0.667f)
                lineToRelative(-12.333f, -7.167f)
                quadToRelative(-0.625f, 0.709f, -1.521f, 1.104f)
                quadToRelative(-0.896f, 0.396f, -1.813f, 0.396f)
                quadToRelative(-2f, 0f, -3.375f, -1.375f)
                reflectiveQuadTo(5.208f, 20f)
                quadToRelative(0f, -1.958f, 1.396f, -3.333f)
                quadTo(8f, 15.292f, 9.958f, 15.292f)
                quadToRelative(0.917f, 0f, 1.792f, 0.354f)
                reflectiveQuadToRelative(1.542f, 1.021f)
                lineToRelative(12.333f, -7.084f)
                quadToRelative(-0.125f, -0.291f, -0.187f, -0.645f)
                quadToRelative(-0.063f, -0.355f, -0.063f, -0.646f)
                quadToRelative(0f, -1.959f, 1.396f, -3.354f)
                quadToRelative(1.396f, -1.396f, 3.354f, -1.396f)
                quadToRelative(1.958f, 0f, 3.333f, 1.375f)
                quadToRelative(1.375f, 1.375f, 1.375f, 3.333f)
                quadToRelative(0f, 2f, -1.375f, 3.375f)
                reflectiveQuadTo(30.125f, 13f)
                quadToRelative(-0.958f, 0f, -1.833f, -0.312f)
                quadToRelative(-0.875f, -0.313f, -1.5f, -1.021f)
                lineToRelative(-12.334f, 6.916f)
                quadToRelative(0.084f, 0.292f, 0.146f, 0.709f)
                quadToRelative(0.063f, 0.416f, 0.063f, 0.708f)
                reflectiveQuadToRelative(-0.063f, 0.625f)
                quadToRelative(-0.062f, 0.333f, -0.146f, 0.625f)
                lineToRelative(12.334f, 7.042f)
                quadToRelative(0.625f, -0.625f, 1.458f, -0.98f)
                quadToRelative(0.833f, -0.354f, 1.875f, -0.354f)
                quadToRelative(1.958f, 0f, 3.333f, 1.396f)
                quadToRelative(1.375f, 1.396f, 1.375f, 3.354f)
                quadToRelative(0f, 1.959f, -1.375f, 3.334f)
                reflectiveQuadToRelative(-3.333f, 1.375f)
                close()
                moveToRelative(0f, -26.042f)
                quadToRelative(0.875f, 0f, 1.479f, -0.625f)
                quadToRelative(0.604f, -0.625f, 0.604f, -1.458f)
                quadToRelative(0f, -0.875f, -0.625f, -1.479f)
                quadToRelative(-0.625f, -0.605f, -1.458f, -0.605f)
                quadToRelative(-0.875f, 0f, -1.479f, 0.605f)
                quadToRelative(-0.604f, 0.604f, -0.604f, 1.479f)
                quadToRelative(0f, 0.875f, 0.604f, 1.479f)
                quadToRelative(0.604f, 0.604f, 1.479f, 0.604f)
                close()
                moveTo(9.958f, 22.083f)
                quadToRelative(0.875f, 0f, 1.48f, -0.604f)
                quadToRelative(0.604f, -0.604f, 0.604f, -1.479f)
                quadToRelative(0f, -0.875f, -0.625f, -1.479f)
                quadToRelative(-0.625f, -0.604f, -1.459f, -0.604f)
                quadToRelative(-0.875f, 0f, -1.479f, 0.604f)
                quadToRelative(-0.604f, 0.604f, -0.604f, 1.479f)
                quadToRelative(0f, 0.875f, 0.604f, 1.479f)
                quadToRelative(0.604f, 0.604f, 1.479f, 0.604f)
                close()
                moveToRelative(20.167f, 11.709f)
                quadToRelative(0.875f, 0f, 1.479f, -0.625f)
                quadToRelative(0.604f, -0.625f, 0.604f, -1.459f)
                quadToRelative(0f, -0.875f, -0.625f, -1.479f)
                quadToRelative(-0.625f, -0.604f, -1.458f, -0.604f)
                quadToRelative(-0.875f, 0f, -1.479f, 0.604f)
                quadToRelative(-0.604f, 0.604f, -0.604f, 1.479f)
                quadToRelative(0f, 0.875f, 0.604f, 1.48f)
                quadToRelative(0.604f, 0.604f, 1.479f, 0.604f)
                close()
                moveToRelative(0f, -25.5f)
                close()
                moveTo(9.958f, 20f)
                close()
                moveToRelative(20.167f, 11.708f)
                close()
            }
        }.build()
    }
}

@Composable
fun rememberMail(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "mail",
            defaultWidth = 40.0.dp,
            defaultHeight = 40.0.dp,
            viewportWidth = 40.0f,
            viewportHeight = 40.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(6.25f, 33.083f)
                quadToRelative(-1.083f, 0f, -1.854f, -0.791f)
                quadToRelative(-0.771f, -0.792f, -0.771f, -1.834f)
                verticalLineTo(9.542f)
                quadToRelative(0f, -1.042f, 0.771f, -1.834f)
                quadToRelative(0.771f, -0.791f, 1.854f, -0.791f)
                horizontalLineToRelative(27.5f)
                quadToRelative(1.083f, 0f, 1.854f, 0.791f)
                quadToRelative(0.771f, 0.792f, 0.771f, 1.834f)
                verticalLineToRelative(20.916f)
                quadToRelative(0f, 1.042f, -0.771f, 1.834f)
                quadToRelative(-0.771f, 0.791f, -1.854f, 0.791f)
                close()
                moveToRelative(27.5f, -21.041f)
                lineTo(20.708f, 20.5f)
                quadToRelative(-0.208f, 0.083f, -0.354f, 0.146f)
                quadToRelative(-0.146f, 0.062f, -0.354f, 0.062f)
                reflectiveQuadToRelative(-0.354f, -0.062f)
                quadToRelative(-0.146f, -0.063f, -0.313f, -0.146f)
                lineTo(6.25f, 12.042f)
                verticalLineToRelative(18.416f)
                horizontalLineToRelative(27.5f)
                close()
                moveTo(20f, 18.292f)
                lineToRelative(13.625f, -8.75f)
                horizontalLineTo(6.417f)
                close()
                moveToRelative(-13.75f, -6.25f)
                verticalLineToRelative(0.333f)
                verticalLineToRelative(-1.812f)
                verticalLineToRelative(0.02f)
                verticalLineToRelative(-1.041f)
                verticalLineToRelative(1.041f)
                verticalLineToRelative(-0.021f)
                verticalLineTo(12.375f)
                verticalLineToRelative(-0.333f)
                verticalLineToRelative(18.416f)
                close()
            }
        }.build()
    }
}