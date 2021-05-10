package com.desarrollodroide.simpledatastore.prefsstore

import kotlinx.coroutines.flow.Flow

interface PreferencesRepository {

    fun isCheckEnabled(): Flow<Boolean>
    suspend fun updateCheck(checked: Boolean)

    fun getSeekValue(): Flow<Int>
    suspend fun updateSeekValue(value: Int)

}