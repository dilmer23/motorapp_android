package com.example.motorapp_android.presenter

import android.os.Handler
import com.example.motorapp_android.contract.MainContract
import com.example.motorapp_android.interactor.MainInteractor

class MainPresenter(private val view: MainContract) {
    private val interactor = MainInteractor()
    fun init() {
        view.showLoading()
        interactor.loadData()
    }
}