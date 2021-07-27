package com.example.kointest

class TestStudentUi: Student() {
  override val course : TestSchoolCourseUi = TestSchoolCourseUi()

   override fun beSmart() : String {
        return course.study()
    }
}

class TestSchoolCourseUi : SchoolCourse(){
    override fun study (): String{
       return "I am studyingggggg"
    }
}