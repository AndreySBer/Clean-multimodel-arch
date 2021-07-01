package com.example.antitheft_impl.repositories_impl

import com.example.antitheft_impl.domain.AntitheftRepository
import com.example.antitheft_impl.domain.models.AntitheftModel
import com.example.core.di.general.PerFeature
import com.example.core_db_api.data.DbClient
import com.example.core_network_api.data.HttpClient
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

@PerFeature
internal class AntitheftRepositoryImpl @Inject constructor(
        private val httpClient: HttpClient,
        private val dbClient: DbClient
) : AntitheftRepository {
    override fun doAntitheftLowLevelWork(): Single<AntitheftModel> {
        return httpClient.doAnyRequest()
                .map { AntitheftModel() }
    }
}