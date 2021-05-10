package com.desarrollodroide.simpledatastore.prefsstore

import androidx.datastore.preferences.core.preferencesKey

object PreferencesKeys {
    val CHECK_KEY = preferencesKey<Boolean>("check_key")
    val SEEK_KEY = preferencesKey<Int>("seek_key")
}