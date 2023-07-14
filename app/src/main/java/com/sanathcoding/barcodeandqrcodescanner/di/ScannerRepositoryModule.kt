package com.sanathcoding.barcodeandqrcodescanner.di

import com.sanathcoding.barcodeandqrcodescanner.data.repository.ScannerRepositoryImpl
import com.sanathcoding.barcodeandqrcodescanner.domain.repository.ScannerRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class ScannerRepositoryModule {

    @Binds
    @Singleton
    abstract fun bindScannerRepository(
        scannerRepositoryImpl: ScannerRepositoryImpl
    ): ScannerRepository

}