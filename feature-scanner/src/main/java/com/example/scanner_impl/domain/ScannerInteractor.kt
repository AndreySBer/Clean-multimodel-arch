package com.example.scanner_impl.domain

import com.example.scanner_impl.domain.models.ScannerModel
import io.reactivex.rxjava3.core.Single

internal interface ScannerInteractor {
    fun doScannerWork(): Single<ScannerModel>
}