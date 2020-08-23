package com.example.eugene_matsyuk.dagger_arch.presentation.main.view;

import android.os.Bundle;

import moxy.MvpAppCompatActivity;
import moxy.presenter.InjectPresenter;
import moxy.presenter.ProvidePresenter;
import com.example.eugene_matsyuk.dagger_arch.R;
import com.example.eugene_matsyuk.dagger_arch.di.app.AppComponent;
import com.example.eugene_matsyuk.dagger_arch.presentation.main.presenter.MainPresenter;

public class MainActivity extends MvpAppCompatActivity implements MainView {

    @InjectPresenter
    MainPresenter mMainPresenter;

    @ProvidePresenter
    MainPresenter provideMainPresenter() {
        return AppComponent.get()
                .mainScreenComponent()
                .mainPresenter();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button_scanner).setOnClickListener(v -> mMainPresenter.clickToScanner());
        findViewById(R.id.button_at).setOnClickListener(v -> mMainPresenter.clickToAntiTheft());
    }



}
