package com.example.eugene_matsyuk.dagger_arch.presentation.main.view

import android.os.Bundle
import android.view.View
import com.example.eugene_matsyuk.dagger_arch.R
import com.example.eugene_matsyuk.dagger_arch.di.app.AppComponent.Companion.get
import com.example.eugene_matsyuk.dagger_arch.presentation.main.presenter.MainPresenter
import moxy.MvpAppCompatActivity
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter

class MainActivity : MvpAppCompatActivity(), MainView {
    @InjectPresenter
    lateinit var mainPresenter: MainPresenter

    @ProvidePresenter
    fun provideMainPresenter(): MainPresenter {
        return get()
                .mainScreenComponent()
                .mainPresenter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.button_scanner).setOnClickListener { mainPresenter.clickToScanner() }
        findViewById<View>(R.id.button_at).setOnClickListener { mainPresenter.clickToAntiTheft() }
    }
}