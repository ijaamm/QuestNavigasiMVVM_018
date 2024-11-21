package com.example.praktikum7

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

enum class Halaman{
                  Form, Data
}
@Composable
fun Navigasi(
    modifier: Modifier = Modifier,
    viewModel: MahasiswaViewModel = viewModel(),
    navHost: NavHostController = rememberNavController()
){}