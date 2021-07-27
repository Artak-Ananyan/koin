package com.example.kointest.lol

import android.app.Application
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.example.kointest.BinSDK
import com.example.kointest.appModule
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.koin.android.ext.android.inject
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.koinApplication
import org.koin.test.KoinTest


@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest : Application(), KoinTest {
    @get:Rule
    val binSDK : BinSDK by inject ()

    @Before
    fun setup(){
        startKoin {
            androidContext(this@ExampleInstrumentedTest)
            modules(listOf(testModule))
        }
    }

    @Test
    fun testing(){
        Assert.assertEquals("Testin", binSDK.sdkReturn)
    }

}

