package com.example.purchase_impl.di

import com.example.core_network_api.data.HttpClientApi

interface PurchaseFeatureDependencies {
    fun httpClient(): HttpClientApi
}