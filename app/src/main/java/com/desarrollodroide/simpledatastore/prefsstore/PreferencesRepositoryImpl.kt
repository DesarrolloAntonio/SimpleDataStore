package com.desarrollodroide.simpledatastore.prefsstore

import android.content.Context
import androidx.datastore.preferences.createDataStore
import com.desarrollodroide.simpledatastore.extensions.getValueFlow
import com.desarrollodroide.simpledatastore.extensions.setValue
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

private const val STORE_NAME = "store_name"

class PreferencesRepositoryImpl @Inject constructor(
        @ApplicationContext context: Context): PreferencesRepository {

            private val dataStore = context.createDataStore(
                    name = STORE_NAME)

    override fun isCheckEnabled() = dataStore.getValueFlow(PreferencesKeys.CHECK_KEY, false)

    override suspend fun updateCheck(checked: Boolean) {
        dataStore.setValue(PreferencesKeys.CHECK_KEY, checked)
    }

    override fun getSeekValue() = dataStore.getValueFlow(PreferencesKeys.SEEK_KEY, 0)

    override suspend fun updateSeekValue(value: Int) {
        dataStore.setValue(PreferencesKeys.SEEK_KEY, value)
    }
}







