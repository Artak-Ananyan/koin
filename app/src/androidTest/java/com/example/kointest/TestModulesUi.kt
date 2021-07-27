package com.example.kointest

import org.koin.core.module.Module
import org.koin.dsl.module

val testModuleUi : Module = module {
 single { SchoolCourse()  }

 factory {TestStudentUi()}

}