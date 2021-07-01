package com.example.scanner_impl.data

import com.example.core.di.general.PerFeature
import com.example.core.utils.SomeUtils
import com.example.core_db_api.data.DbClient
import com.example.core_network_api.data.HttpClient
import com.example.scanner_impl.domain.ScannerRepository
import com.example.scanner_impl.domain.models.ScannerModel
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

@PerFeature
internal class ScannerRepositoryImpl @Inject constructor(
        private val httpClient: HttpClient,
        private val dbClient: DbClient,
        private val someUtils: SomeUtils
) : ScannerRepository {
    override fun doScannerLowLevelWork(): Single<ScannerModel> {
        return httpClient.doAnyRequest()
                .map { o: Any -> ScannerModel() }
    }
}