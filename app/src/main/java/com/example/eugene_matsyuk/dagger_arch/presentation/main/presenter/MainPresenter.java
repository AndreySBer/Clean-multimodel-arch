package com.example.eugene_matsyuk.dagger_arch.presentation.main.presenter;

import moxy.InjectViewState;
import moxy.MvpPresenter;
import com.example.eugene_matsyuk.dagger_arch.presentation.main.view.MainView;

import javax.inject.Inject;
import javax.inject.Named;

import ru.terrakok.cicerone.Router;

import static com.example.eugene_matsyuk.dagger_arch.di.DiConstants.GLOBAL;
import static com.example.eugene_matsyuk.dagger_arch.routing.GlobalScreenNames.AV_FEATURE;
import static com.example.eugene_matsyuk.dagger_arch.routing.GlobalScreenNames.SCANNER_FEATURE;

@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {

    private final Router mRouter;

    @Inject
    public MainPresenter(@Named(GLOBAL) Router mRouter) {
        this.mRouter = mRouter;
    }

    public void clickToScanner() {
        mRouter.navigateTo(SCANNER_FEATURE);
    }

    public void clickToAntiTheft() {
        mRouter.navigateTo(AV_FEATURE);
    }

}
