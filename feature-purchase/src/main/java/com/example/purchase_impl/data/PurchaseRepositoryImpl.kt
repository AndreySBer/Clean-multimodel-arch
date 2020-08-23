package com.example.purchase_impl.data

import com.example.core.di.general.PerFeature
import com.example.core_network_api.data.HttpClientApi
import com.example.purchase_api.domain.models.PurchaseModel
import com.example.purchase_impl.domain.PurchaseRepository
import io.reactivex.Single
import javax.inject.Inject

@PerFeature
internal class PurchaseRepositoryImpl @Inject constructor(private val httpClient: HttpClientApi) : PurchaseRepository {
    override fun makePurchaseInStore(): Single<PurchaseModel> {
        return httpClient.doAnyRequest()
                .map { o: Any? -> PurchaseModel() }
    }
}