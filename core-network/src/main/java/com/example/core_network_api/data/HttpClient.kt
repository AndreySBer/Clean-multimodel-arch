package com.example.core_network_api.data

import io.reactivex.rxjava3.core.Single

interface HttpClient {
    fun doAnyRequest(): Single<Any>
}