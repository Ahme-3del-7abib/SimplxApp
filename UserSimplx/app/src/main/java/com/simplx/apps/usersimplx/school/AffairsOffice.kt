package com.simplx.apps.usersimplx.school

class AffairsOffice(private val student: Student, private val teacher: Teacher) {

    fun getAllData(): String {
        return " ${student.getStudentData()}  \n ${teacher.getTeacherData()} "
    }
}