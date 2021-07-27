package com.example.kointest

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.KoinApplication
import org.koin.core.context.loadKoinModules
import org.koin.core.context.startKoin
import org.koin.core.module.Module

open class HomeApplication : Application() {
        override fun onCreate() {
            super.onCreate()
            startKoin {
                androidLogger()
                androidContext(this@HomeApplication)
                modules(emptyList())
            }
        }

    internal fun injectModule(module: Module) {
        loadKoinModules(module)
    }
}