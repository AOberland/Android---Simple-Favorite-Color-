package com.violet.colorapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VioletColorApp()
        }
    }
}

@Composable
fun VioletColorApp() {
    var currentScreen by remember { mutableStateOf(Screen.WELCOME) }
    var currentBackground by remember { mutableStateOf(Color.White) }
    
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(currentBackground)
    ) {
        when (currentScreen) {
            Screen.WELCOME -> WelcomeScreen(
                onGreenSelected = {
                    currentScreen = Screen.GREEN_SHADES
                    currentBackground = Color(0xFF4CAF50) // Base green
                },
                onPurpleSelected = {
                    currentScreen = Screen.PURPLE_SHADES
                    currentBackground = Color(0xFF9C27B0) // Base purple
                }
            )
            Screen.GREEN_SHADES -> ShadeScreen(
                shades = greenShades,
                onShadeSelected = { color ->
                    currentBackground = color
                },
                onBackPressed = {
                    currentScreen = Screen.WELCOME
                    currentBackground = Color.White
                }
            )
            Screen.PURPLE_SHADES -> ShadeScreen(
                shades = purpleShades,
                onShadeSelected = { color ->
                    currentBackground = color
                },
                onBackPressed = {
                    currentScreen = Screen.WELCOME
                    currentBackground = Color.White
                }
            )
        }
    }
}

enum class Screen {
    WELCOME, GREEN_SHADES, PURPLE_SHADES
}

data class Shade(
    val name: String,
    val color: Color
)

@Composable
fun WelcomeScreen(
    onGreenSelected: () -> Unit,
    onPurpleSelected: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Hello Violet. What's your favorite color today?",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            color = Color.Black,
            modifier = Modifier.padding(bottom = 48.dp)
        )
        
        Spacer(modifier = Modifier.height(32.dp))
        
        Button(
            onClick = onGreenSelected,
            modifier = Modifier
                .fillMaxWidth()
                .height(64.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF4CAF50)
            )
        ) {
            Text(
                text = "Green",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
        
        Spacer(modifier = Modifier.height(24.dp))
        
        Button(
            onClick = onPurpleSelected,
            modifier = Modifier
                .fillMaxWidth()
                .height(64.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF9C27B0)
            )
        ) {
            Text(
                text = "Purple",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
    }
}

@Composable
fun ShadeScreen(
    shades: List<Shade>,
    onShadeSelected: (Color) -> Unit,
    onBackPressed: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Back button
        Button(
            onClick = onBackPressed,
            modifier = Modifier
                .align(Alignment.Start)
                .padding(bottom = 16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White.copy(alpha = 0.8f)
            )
        ) {
            Text(
                text = "← Back",
                fontSize = 18.sp,
                color = Color.Black
            )
        }
        
        // Shade grid
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.fillMaxSize()
        ) {
            items(shades) { shade ->
                Button(
                    onClick = { onShadeSelected(shade.color) },
                    modifier = Modifier
                        .height(80.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = shade.color
                    )
                ) {
                    Text(
                        text = shade.name,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}

// Green shades
val greenShades = listOf(
    Shade("Forest Green", Color(0xFF4CAF50)),
    Shade("Dark Green", Color(0xFF388E3C)),
    Shade("Light Green", Color(0xFF8BC34A)),
    Shade("Lime Green", Color(0xFFCDDC39)),
    Shade("Olive Green", Color(0xFFAFB42B)),
    Shade("Pine Green", Color(0xFF689F38)),
    Shade("Dark Forest", Color(0xFF33691E)),
    Shade("Spring Green", Color(0xFF7CB342)),
    Shade("Sage Green", Color(0xFF558B2F)),
    Shade("Mint Green", Color(0xFF9CCC65))
)

// Purple shades
val purpleShades = listOf(
    Shade("Purple", Color(0xFF9C27B0)),
    Shade("Dark Purple", Color(0xFF7B1FA2)),
    Shade("Light Purple", Color(0xFFE1BEE7)),
    Shade("Pink Purple", Color(0xFFBA68C8)),
    Shade("Violet", Color(0xFFAB47BC)),
    Shade("Deep Purple", Color(0xFF8E24AA)),
    Shade("Dark Violet", Color(0xFF6A1B9A)),
    Shade("Royal Purple", Color(0xFF4A148C)),
    Shade("Bright Purple", Color(0xFFEA80FC)),
    Shade("Lavender", Color(0xFFCE93D8))
) 