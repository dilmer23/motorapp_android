package com.example.motorapp_android.view

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import com.example.motorapp_android.R
import com.example.motorapp_android.contract.MainContract
import com.example.motorapp_android.presenter.MainPresenter
import com.example.motorapp_android.presenter.SplashPresenter

class MainActivity : AppCompatActivity(), MainContract {
    private  lateinit var presenter: MainPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainPresenter(this)
        presenter.init()
    }

    override fun showLoading() {
        Toast.makeText(this, "prueba", Toast.LENGTH_SHORT).show()

    }

}