package com.desarrollodroide.simpledatastore.di

import com.desarrollodroide.simpledatastore.prefsstore.PreferencesRepository
import com.desarrollodroide.simpledatastore.prefsstore.PreferencesRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class AppModule {

    @Binds
    abstract fun providesPrefsRepository(impl: PreferencesRepositoryImpl): PreferencesRepository

}