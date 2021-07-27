package com.example.kointest

import android.app.Application

import org.koin.android.ext.android.get

class BinSDK (application: Application){
    var injeted = application.get<ClassReturnString>()
    var sdkReturn  =   injeted.getMyString()

}