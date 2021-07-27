package com.example.kointest

import org.koin.core.module.Module
import org.koin.dsl.module

val appModule : Module = module {
 single { SchoolCourse()  }

 factory {Student()}

}