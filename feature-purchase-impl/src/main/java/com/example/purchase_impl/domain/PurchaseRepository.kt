package com.example.purchase_impl.domain

import com.example.purchase_api.domain.models.PurchaseModel
import io.reactivex.rxjava3.core.Single

internal interface PurchaseRepository {
    fun makePurchaseInStore(): Single<PurchaseModel>
}