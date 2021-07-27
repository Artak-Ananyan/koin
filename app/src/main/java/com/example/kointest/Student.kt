package com.example.kointest

open class Student {
  open val course : SchoolCourse = SchoolCourse()

    open fun beSmart() : String {
        return course.study()
    }
}

 open class SchoolCourse{
    open fun study (): String{
       return "I am studying"
    }
}