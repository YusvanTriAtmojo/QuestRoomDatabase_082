package com.example.application7.ui.viewmodel

import androidx.lifecycle.SavedStateHandle
import com.example.application7.data.entity.Mahasiswa
import com.example.application7.repository.RepositoryMhs


class DetailMhsViewModel(
    savedStateHandle: SavedStateHandle,
    private val repositoryMhs: RepositoryMhs,
) {

}


data class DetailUiState(
    val detailUiEvent: MahasiswaEvent = MahasiswaEvent(),
    val isLoading: Boolean = false,
    val isError: Boolean = false,
    val errorMessage: String = ""
) {
    val isUiEventEmpty: Boolean
        get() = detailUiEvent == MahasiswaEvent()

    val isUiEventNotEmpty: Boolean
        get() = detailUiEvent != MahasiswaEvent()
}

/* Data class untuk menampung data yang akan ditampilkan di UI */

//memindahkan data dari entity ke ui
fun Mahasiswa.toDetailUiEvent(): MahasiswaEvent {
    return MahasiswaEvent(
        nim = nim,
        nama = nama,
        jenisKelamin = jenisKelamin,
        alamat = alamat,
        kelas = kelas,
        angkatan = angkatan
    )
}
