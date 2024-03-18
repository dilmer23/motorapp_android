package com.example.motorapp_android.contract

import android.content.Context

interface  SplashContract {
    val context: Context
    fun showLoading()
    fun hideLoading()
    fun navigateToNextScreen()
}