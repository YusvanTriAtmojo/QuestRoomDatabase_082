package com.example.application7.ui.viewmodel

import com.example.application7.data.entity.Mahasiswa


class UpdateMhsViewModel (
)  {
}

fun Mahasiswa.toUIStateMhs() : MhsUIState = MhsUIState(
    mahasiswaEvent = this.toDetailUiEvent(),
)


