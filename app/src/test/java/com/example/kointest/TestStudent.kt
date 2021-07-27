package com.example.kointest

class TestStudent: Student() {
  override val course : TestSchoolCourse = TestSchoolCourse()

   override fun beSmart() : String {
        return course.study()
    }
}

class TestSchoolCourse : SchoolCourse(){
    override fun study (): String{
       return "I am studyingggggg"
    }
}