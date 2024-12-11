package com.example.application7.repository

import com.example.application7.data.dao.MahasiswaDao
import com.example.application7.data.entity.Mahasiswa

class LocalRepositoryMhs(
    private val mahasiswaDao: MahasiswaDao
) : RepositoryMhs {
    override suspend fun insertMhs(mahasiswa: Mahasiswa){
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }
}