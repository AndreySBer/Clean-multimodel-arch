package com.example.antitheft_impl.di

import com.example.antitheft_impl.repositories_impl.AntitheftRepositoryImpl
import com.example.antitheft_impl.domain.AntitheftInteractor
import com.example.antitheft_impl.domain.AntitheftInteractorImpl
import com.example.antitheft_impl.domain.AntitheftRepository
import com.example.antitheft_impl.start.AntitheftStarterImpl
import com.example.core.di.general.PerFeature
import com.example.antitheft_api.AntitheftStarter
import dagger.Binds
import dagger.Module

@Module
internal abstract class AntitheftFeatureModule {
    @PerFeature
    @Binds
    abstract fun provideAntitheftRepository(antitheftRepository: AntitheftRepositoryImpl): AntitheftRepository
    @PerFeature
    @Binds
    abstract fun provideAntitheftInteractor(antitheftInteractor: AntitheftInteractorImpl): AntitheftInteractor
    @PerFeature
    @Binds
    abstract fun provideAntitheftStarter(antitheftStarter: AntitheftStarterImpl): AntitheftStarter
}