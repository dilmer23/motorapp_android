package com.example.motorapp_android.presenter

import android.os.Handler
import com.example.motorapp_android.contract.SplashContract
import com.example.motorapp_android.interactor.SplashInteractor

class SplashPresenter(private val view: SplashContract) {
    private val interactor = SplashInteractor()

    fun init() {
        view.showLoading()
        interactor.loadData()
        // Simular una espera de 3 segundos antes de navegar a la siguiente pantalla
        Handler().postDelayed({
            view.hideLoading()
            view.navigateToNextScreen()
        }, 5000)
    }
}
