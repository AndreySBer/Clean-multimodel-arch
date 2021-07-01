package com.example.antitheft_impl.domain

import com.example.antitheft_impl.domain.models.AntitheftModel
import io.reactivex.rxjava3.core.Single

internal interface AntitheftInteractor {
    fun doAntitheftWork(): Single<AntitheftModel>
}