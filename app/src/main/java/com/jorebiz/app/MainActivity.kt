package com.jorebiz.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val NavyBlue = Color(0xFF071A35)
private val DeepBlue = Color(0xFF102D55)
private val BrightBlue = Color(0xFF168BFF)
private val AccentRed = Color(0xFFE53945)
private val White = Color(0xFFFFFFFF)
private val SoftWhite = Color(0xFFDCE8F5)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            JoreBizApp()
        }
    }
}

@Composable
fun JoreBizApp() {
    MaterialTheme(
        colorScheme = darkColorScheme(
            primary = BrightBlue,
            secondary = AccentRed,
            background = NavyBlue,
            surface = DeepBlue,
            onPrimary = White,
            onSecondary = White,
            onBackground = White,
            onSurface = White
        )
    ) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = NavyBlue
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "JORE BIZ",
                    color = White,
                    fontSize = 38.sp,
                    fontWeight = FontWeight.ExtraBold
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "BUSINESS MANAGEMENT SYSTEM",
                    color = BrightBlue,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(28.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            color = DeepBlue,
                            shape = RoundedCornerShape(18.dp)
                        )
                        .padding(22.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = "Karibu JORE BIZ",
                            color = White,
                            fontSize = 23.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(
                            text = "Manage your business smarter.",
                            color = SoftWhite,
                            fontSize = 15.sp
                        )

                        Spacer(modifier = Modifier.height(20.dp))

                        Button(
                            onClick = {},
                            colors = ButtonDefaults.buttonColors(
                                containerColor = BrightBlue
                            ),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text("GET STARTED", color = White)
                        }

                        Spacer(modifier = Modifier.height(10.dp))

                        Button(
                            onClick = {},
                            colors = ButtonDefaults.buttonColors(
                                containerColor = AccentRed
                            ),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text("VERSION 2.0.0", color = White)
                        }
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                Text(
                    text = "OFFLINE-FIRST  •  SECURE  •  SMART",
                    color = SoftWhite,
                    fontSize = 11.sp
                )
            }
        }
    }
}
