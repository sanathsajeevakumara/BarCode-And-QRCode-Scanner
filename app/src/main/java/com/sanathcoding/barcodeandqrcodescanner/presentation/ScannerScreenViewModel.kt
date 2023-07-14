package com.sanathcoding.barcodeandqrcodescanner.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sanathcoding.barcodeandqrcodescanner.domain.repository.ScannerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ScannerScreenViewModel @Inject constructor(
    private val scannerRepository: ScannerRepository
): ViewModel() {

    var scannerState by mutableStateOf(ScannerState())
        private set

    fun startScanner() {
        viewModelScope.launch {
            scannerRepository.startScanner().collect { value ->
                value?.let {
                    scannerState = scannerState.copy(details = it)
                }
            }
        }
    }
}