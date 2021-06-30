package com.example.purchase_api.domain

import com.example.purchase_api.domain.models.PurchaseModel
import io.reactivex.rxjava3.core.Single

interface PurchaseInteractor {
    fun makePurchase(): Single<PurchaseModel>
}