package com.poojasingh.reelsfeature.di

import com.poojasingh.reelsfeature.data.model.Mock
import com.poojasingh.reelsfeature.data.repository.DataRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@InstallIn(ActivityRetainedComponent::class)
@Module
object RepositoryModule {
    @Provides
    fun providesDataRepository(mock: Mock): DataRepository {
        return DataRepository(mock)
    }
}