package com.example.myapplication

import android.content.Context
import android.widget.Toast
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object HiltModule {

    @Provides
    @Singleton
    fun provideAnalyticsService(@ApplicationContext context: Context): AnalyticsService {
        return AnalyticsService(context)
    }
}

class AnalyticsService(private val context: Context) {
    fun sendAnalytics() {
        Toast.makeText(context, "Analytics sent from an injected class *beeep*", Toast.LENGTH_SHORT).show()
    }
}
