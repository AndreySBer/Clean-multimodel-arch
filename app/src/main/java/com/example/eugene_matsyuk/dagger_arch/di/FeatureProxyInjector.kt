package com.example.eugene_matsyuk.dagger_arch.di

import com.example.antitheft.di.AntitheftFeatureComponent
import com.example.antitheft.di.DaggerAntitheftFeatureComponent_AntitheftFeatureDependenciesComponent
import com.example.core.di.app.CoreUtilsComponent
import com.example.core_db_impl.di.CoreDbComponent
import com.example.core_network_impl.di.CoreNetworkComponent
import com.example.feature_antitheft_api.AntitheftFeatureApi
import com.example.feature_scanner_api.ScannerFeatureApi
import com.example.purchase_api.di.PurchaseFeatureApi
import com.example.purchase_impl.di.DaggerPurchaseComponent_PurchaseFeatureDependenciesComponent
import com.example.purchase_impl.di.PurchaseComponent
import com.example.scanner.di.DaggerScannerFeatureComponent_ScannerFeatureDependenciesComponent
import com.example.scanner.di.ScannerFeatureComponent

object FeatureProxyInjector {
    val featureScanner: ScannerFeatureApi
        get() = ScannerFeatureComponent.initAndGet(
                DaggerScannerFeatureComponent_ScannerFeatureDependenciesComponent.builder()
                        .coreDbApi(CoreDbComponent.get())
                        .coreNetworkApi(CoreNetworkComponent.get())
                        .coreUtilsApi(CoreUtilsComponent.get())
                        .purchaseFeatureApi(featurePurchaseGet())
                        .build()
        )
    val featureAntitheft: AntitheftFeatureApi
        get() = AntitheftFeatureComponent.initAndGet(
                DaggerAntitheftFeatureComponent_AntitheftFeatureDependenciesComponent.builder()
                        .coreNetworkApi(CoreNetworkComponent.get())
                        .coreDbApi(CoreDbComponent.get())
                        .coreUtilsApi(CoreUtilsComponent.get())
                        .purchaseFeatureApi(featurePurchaseGet())
                        .build()
        )

    private fun featurePurchaseGet(): PurchaseFeatureApi {
        return PurchaseComponent.initAndGet(
                DaggerPurchaseComponent_PurchaseFeatureDependenciesComponent.builder()
                        .coreNetworkApi(CoreNetworkComponent.get())
                        .build()
        )
    }
}