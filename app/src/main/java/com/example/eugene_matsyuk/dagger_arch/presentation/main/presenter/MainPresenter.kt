package com.example.eugene_matsyuk.dagger_arch.presentation.main.presenter

import com.example.eugene_matsyuk.dagger_arch.di.DiConstants.GLOBAL
import com.example.eugene_matsyuk.dagger_arch.presentation.main.view.MainView
import com.example.eugene_matsyuk.dagger_arch.routing.GlobalScreenNames.AV_FEATURE
import com.example.eugene_matsyuk.dagger_arch.routing.GlobalScreenNames.SCANNER_FEATURE
import com.github.terrakok.cicerone.Router
import moxy.InjectViewState
import moxy.MvpPresenter
import javax.inject.Inject
import javax.inject.Named

@InjectViewState
class MainPresenter @Inject constructor(@param:Named(GLOBAL) private val router: Router) : MvpPresenter<MainView>() {
    fun clickToScanner() {
        router.navigateTo(SCANNER_FEATURE)
    }

    fun clickToAntiTheft() {
        router.navigateTo(AV_FEATURE)
    }
}