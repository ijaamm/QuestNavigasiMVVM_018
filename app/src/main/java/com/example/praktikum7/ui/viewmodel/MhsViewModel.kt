package com.example.praktikum7.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.praktikum7.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MhsViewModel : ViewModel() {
    //only access internal class
    private val _dataModel = MutableStateFlow(Mahasiswa())
    //access for public
    val dataModel : StateFlow<Mahasiswa> = _dataModel.asStateFlow()

    fun saveDataMhs(
        ListData  : MutableList<String>
    ) {
        _dataModel.update { mhs ->
            mhs.copy(
                nama = ListData[0],
                gender = ListData[2],
                alamat = ListData[1],
                email = ListData[3],
                noTelpon = ListData[4]
            )
        }
    }
}