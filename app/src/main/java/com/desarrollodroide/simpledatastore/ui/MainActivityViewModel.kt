package com.desarrollodroide.simpledatastore.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.desarrollodroide.simpledatastore.prefsstore.PreferencesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(private val preferencesRepository: PreferencesRepository): ViewModel(){

    fun enableCheck(enable: Boolean){
        viewModelScope.launch {
            preferencesRepository.updateCheck(enable)
        }
    }

    val check = preferencesRepository.isCheckEnabled().asLiveData()

    fun updateSeekValue(value: Int){
        viewModelScope.launch {
            preferencesRepository.updateSeekValue(value)
        }
    }

    val seekValue = preferencesRepository.getSeekValue().asLiveData()

}