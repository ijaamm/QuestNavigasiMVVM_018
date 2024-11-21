package com.example.praktikum7

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import com.example.praktikum7.model.ListGender

enum class Halaman{
                  Form, Data
}
@Composable
fun Navigasi(
    modifier: Modifier = Modifier,
    viewModel: MahasiswaViewModel = viewModel(),
    navHost: NavHostController = rememberNavController()
){
    composable(route = Halaman.Form.name) {
        val konteks = LocalContext.current
        FormMahasiswaView(

            listGender = ListGender.listGender.map { id -> konteks.getString(id)
            },
            onSubmitClick = {
                viewModel.savedDataMhs(it)
                navHost.navigate(Halaman.Data.name)
            }
        )
    }