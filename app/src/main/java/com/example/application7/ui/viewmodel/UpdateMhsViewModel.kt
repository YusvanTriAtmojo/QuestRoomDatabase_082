package com.example.application7.ui.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.application7.data.entity.Mahasiswa
import com.example.application7.repository.RepositoryMhs
import com.example.application7.ui.navigation.DestinasiUpdate


class UpdateMhsViewModel (
    savedStateHandle: SavedStateHandle,
    private val repositoryMhs: RepositoryMhs
) : ViewModel() {
    var updateUIState by mutableStateOf(MhsUIState())
    private val _nim: String = checkNotNull(savedStateHandle[DestinasiUpdate.NIM])

}


fun Mahasiswa.toUIStateMhs() : MhsUIState = MhsUIState(
    mahasiswaEvent = this.toDetailUiEvent(),
)


