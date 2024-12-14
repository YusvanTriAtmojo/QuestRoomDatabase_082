package com.example.application7.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.application7.data.entity.Mahasiswa
import com.example.application7.repository.RepositoryMhs
import kotlinx.coroutines.flow.StateFlow

class HomeMhsViewModel(
    private val repositoryMhs: RepositoryMhs
) : ViewModel() {
    val homeUiState: StateFlow<HomeUiState> = repositoryMhs.getAllMhs()
}

data class HomeUiState(
    val listMhs: List<Mahasiswa> = listOf(),
    val isLoading: Boolean = false,
    val isError: Boolean = false,
    val errorMessage: String = ""
)