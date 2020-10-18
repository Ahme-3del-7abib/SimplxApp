package com.simplx.apps.usersimplx.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class SchoolViewModel : ViewModel() {

    var repository: SchoolRepository = SchoolRepository()
    val mutableLiveData: MutableLiveData<String> = MutableLiveData<String>()

    fun setData(stu_name: String, teach_name: String) {
        repository.setData(stu_name, teach_name)
    }

    fun getAllData() {
        mutableLiveData.value = repository.getAllData()
    }
}