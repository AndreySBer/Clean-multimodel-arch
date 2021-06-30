package com.example.eugene_matsyuk.dagger_arch.di.app

import com.example.eugene_matsyuk.dagger_arch.di.DiConstants.GLOBAL
import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.Router
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class GlobalNavigationModule {
    private val cicerone: Cicerone<Router> = Cicerone.create()

    @Singleton
    @Provides
    @Named(GLOBAL)
    fun provideRouter(): Router {
        return cicerone.router
    }

    @Singleton
    @Provides
    @Named(GLOBAL)
    fun provideNavigatorHolder(): NavigatorHolder {
        return cicerone.getNavigatorHolder()
    }

}