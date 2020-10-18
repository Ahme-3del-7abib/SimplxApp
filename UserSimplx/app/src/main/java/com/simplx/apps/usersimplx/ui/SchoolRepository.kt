package com.simplx.apps.usersimplx.ui

import com.simplx.apps.usersimplx.school.AffairsOffice
import com.simplx.apps.usersimplx.school.Student
import com.simplx.apps.usersimplx.school.Teacher

class SchoolRepository() {

    lateinit var affairsOffice: AffairsOffice

    fun setData(st_name: String, teach_name: String) {
        affairsOffice = AffairsOffice(Student(st_name), Teacher(teach_name))
    }

    fun getAllData(): String {
        return affairsOffice.getAllData()
    }
}