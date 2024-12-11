package com.example.application7.dependeciesinjection

import android.content.Context
import com.example.application7.data.database.KrsDatabase
import com.example.application7.repository.LocalRepositoryMhs
import com.example.application7.repository.RepositoryMhs

interface InterfaceContainerApp {
    val repositoryMhs: RepositoryMhs
}

class ContainerApp(private val context: Context) : InterfaceContainerApp {
    override val repositoryMhs: RepositoryMhs by lazy {
        LocalRepositoryMhs(KrsDatabase.getDatabase(context).mahasiswaDao())
    }
}