package com.example.kointest

import android.app.Application
import org.junit.Test

import org.junit.Assert.*
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import org.junit.Rule
import org.junit.runner.RunWith
import org.koin.android.ext.android.get
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.android.ext.android.get
import org.koin.test.KoinTest
import org.koin.test.KoinTestRule
import org.koin.test.inject
import org.koin.test.mock.MockProviderRule


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

class ExampleUnitTest : KoinTest, Application(){

    val binSDK : BinSDK by inject ()

    @get:Rule
    val koinTestRule = KoinTestRule.create{
        modules(testModule)
        androidContext(this@ExampleUnitTest)
    }

    @get:Rule
    val mockProvider = MockProviderRule.create { clazz ->
        ClassReturnString()
    }
    @Test
    fun addition_isCorrect() {


        Log.d("Test",  binSDK.sdkReturn)

        assertEquals("Testin", binSDK.sdkReturn)
    }
}