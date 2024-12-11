package com.example.application7

import android.app.Application
import com.example.application7.dependeciesinjection.ContainerApp

class KrsApp : Application() {
    //Fungsinya untuk menyimpan instance ConatinerApp
    lateinit var containerApp: ContainerApp

    override fun onCreate() {
        super.onCreate()
        //membuat instance ContainerApp
        containerApp = ContainerApp(this)
        //instance adalah object yang dibuat dari class
    }
}