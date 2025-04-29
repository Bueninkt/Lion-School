package br.senai.sp.jandira.lionschool

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import br.senai.sp.jandira.lionschool.screens.HomeScreen

import br.senai.sp.jandira.lionschool.ui.theme.LionSchoolTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            LionSchoolTheme {
                HomeScreen()
            }
        }
    }
}