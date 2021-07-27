package com.example.kointest

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.Module
import org.koin.dsl.module

val appModule : Module = module {
 single { BinSDK(androidContext() as Application)  }

 factory {ClassReturnString()}

}