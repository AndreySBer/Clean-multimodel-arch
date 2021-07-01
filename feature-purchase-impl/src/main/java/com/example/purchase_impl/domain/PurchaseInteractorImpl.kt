package com.example.purchase_impl.domain

import com.example.core.di.general.PerFeature
import com.example.purchase_api.domain.PurchaseInteractor
import com.example.purchase_api.domain.models.PurchaseModel
import io.reactivex.rxjava3.core.Single
import java.util.concurrent.TimeUnit
import javax.inject.Inject

@PerFeature
internal class PurchaseInteractorImpl @Inject constructor(private val purchaseRepository: PurchaseRepository) : PurchaseInteractor {
    override fun makePurchase(): Single<PurchaseModel> {
        return purchaseRepository.makePurchaseInStore()
                .flatMap { purchaseModel: PurchaseModel -> doSomeLogic(purchaseModel) }
    }

    private fun doSomeLogic(purchaseModel: PurchaseModel): Single<PurchaseModel> {
        return Single.timer(3000, TimeUnit.MILLISECONDS)
                .map { purchaseModel }
    }
}