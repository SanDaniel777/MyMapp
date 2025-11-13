package com.example.mymapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.mymapp.ui.AppNavigation
import com.example.mymapp.ui.theme.MyMappTheme// Asegúrate de usar tu tema
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyMappTheme {
                AppNavigation()
            }
        }
    }
}