package com.sanathcoding.barcodeandqrcodescanner.domain.repository

import kotlinx.coroutines.flow.Flow

interface ScannerRepository {
    fun startScanner(): Flow<String?>
}