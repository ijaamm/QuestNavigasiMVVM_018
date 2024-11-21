package com.example.praktikum7.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.praktikum7.model.Mahasiswa

@Composable
fun DetailMhsView(
    dataMhs: Mahasiswa,
    modifier: Modifier = Modifier,
    onClickButton: () -> Boolean
){
    val listDataMhs = listOf(
        Pair("Nama", dataMhs.nama),
        Pair("jenis kelamin", dataMhs.gender),
        Pair("alamat", dataMhs.alamat),
        Pair("email", dataMhs.email),
        Pair("noTelpon", dataMhs.noTelpon)
    )

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        listDataMhs.forEach { data ->
            DetailMhs(data.first, data.second)
        }
        Button(onClick = { onClickButton () }) {
            Text(text = "kembali")
        }
    }
}
