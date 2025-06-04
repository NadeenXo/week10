package com.example.tomandjerry

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.screen.JerryStore
import com.example.tomandjerry.ui.theme.TomAndJerryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TomAndJerryTheme {
                Scaffold { innerPadding ->
                    JerryStore(modifier = Modifier.padding(innerPadding).padding(8.dp))
                }
            }
        }
    }
}

