package com.example.mylibrary

import com.example.mylibrary.screens.ProfileRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ProfileModule {

    @Provides
    fun provideProfileRepository(): ProfileRepository {
        return ProfileRepository()
    }
}
