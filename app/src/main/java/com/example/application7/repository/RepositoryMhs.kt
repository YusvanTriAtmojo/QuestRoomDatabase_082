package com.example.application7.repository

import com.example.application7.data.entity.Mahasiswa
import java.util.concurrent.Flow

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)

    fun getAllMhs(): Flow<List<Mahasiswa>>

    fun getMhs(nim: String): Flow<Mahasiswa>

    suspend fun deleteMhs(mahasiswa: Mahasiswa)

    suspend fun updateMhs(mahasiswa: Mahasiswa)
}