package com.example.application7.repository

import com.example.application7.data.entity.Mahasiswa

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)
}