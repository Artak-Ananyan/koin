package com.example.kointest.lol

import android.app.Application
import com.example.kointest.BinSDK
import com.example.kointest.ClassReturnString
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.Module
import org.koin.dsl.module

val testModule : Module = module {
 single { BinSDK(androidContext() as Application)   }

 factory { ClassReturnString() }

}