package com.example.scanner_impl.di

import com.example.core.di.general.PerFeature
import dagger.Module
import dagger.Provides
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router

@Module
internal class ScreenNavigationModule {
    private val cicerone: Cicerone<Router> = Cicerone.create()

    @PerFeature
    @Provides
    fun provideRouter(): Router {
        return cicerone.router
    }

    @PerFeature
    @Provides
    fun provideNavigatorHolder(): NavigatorHolder {
        return cicerone.navigatorHolder
    }

}