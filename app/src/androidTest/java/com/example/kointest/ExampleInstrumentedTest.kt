package com.example.kointest

import android.app.Application
import android.os.Bundle
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import com.android.dx.command.Main
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.koin.android.ext.android.inject
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.koinApplication
import org.koin.test.KoinTest
import org.koin.test.inject


@RunWith(AndroidJUnit4ClassRunner::class)
class ExampleInstrumentedTest : Application() {
    val binSDK : BinSDK by inject ()


    @get:Rule
    var activityTestRule = ActivityTestRule(MainActivity::class.java)
    @Before
    fun setup(){

    }

    @Test
    fun testing(){
        assertEquals("lol", binSDK.sdkReturn)
    }

}

