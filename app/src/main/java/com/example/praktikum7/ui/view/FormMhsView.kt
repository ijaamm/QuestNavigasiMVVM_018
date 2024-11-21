package com.example.praktikum7.ui.view


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.GrammaticalInflectionManagerCompat.GrammaticalGender

@Composable
fun FormMhsView(
    modifier: Modifier = Modifier,
    listGender: List<String>,
    onSubmitClick: (MutableList<String>) -> Unit
){
    var nama by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var noTelpon by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var memilihJk by remember { mutableStateOf("") }

    val listData: MutableList<String> = mutableListOf(nama,alamat,memilihJk,email,noTelpon)

        Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text("Biodata",
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold)

        Spacer(Modifier .padding(15.dp))
        TextField(
            modifier = Modifier.fillMaxWidth() .padding(5.dp),
            value = nama,
            onValueChange = { nama = it },
            label = {Text("nama")},
            placeholder = {Text("Masukkan Nama")}
        )

        Row{
            listGender.forEach { item ->
                Row (verticalAlignment = Alignment.CenterVertically){ RadioButton(
                    selected = memilihJk == item,
                    onClick = { memilihJk = item }
                )
                    Text(item)
                }
            }
        }
        TextField(
            modifier = Modifier.fillMaxWidth() .padding(5.dp),
            value = email,
            onValueChange = { email = it },
            label = {Text("email")},
            placeholder = {Text("Masukkan email")}
        )
        TextField(
            modifier = Modifier.fillMaxWidth() .padding(5.dp),
            value = noTelpon,
            onValueChange = { noTelpon = it },
            label = {Text("noTelpon")},
            placeholder = {Text("Masukkan noTelpon")}
        )
        TextField(
            modifier = Modifier.fillMaxWidth() .padding(5.dp),
            value = alamat,
            onValueChange = { alamat = it },
            label = {Text("alamat")},
            placeholder = {Text("Masukkan alamat")}
        )

        Button (onClick = {
            onSubmitClick(listData)
        }) {
            Text(text = "Submit")
        }
    }
}