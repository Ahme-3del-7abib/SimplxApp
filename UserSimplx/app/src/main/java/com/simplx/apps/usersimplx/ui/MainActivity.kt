package com.simplx.apps.usersimplx.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.simplx.apps.usersimplx.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: SchoolViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this).get(SchoolViewModel::class.java)

        showDataBtnId.setOnClickListener(View.OnClickListener {

            viewModel.setData(studentNameId.text.toString(), teacherNameId.text.toString())

            viewModel.getAllData()
            viewModel.mutableLiveData.observe(this, Observer {
                showDataTvId.text = it
            })
        })
    }
}