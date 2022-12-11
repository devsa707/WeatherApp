package com.devsa707.weatherapp.di

import com.devsa707.weatherapp.data.repository.WeatherRepositoryImplementation
import com.devsa707.weatherapp.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindWeatherRepository(weatherRepositoryImplementation: WeatherRepositoryImplementation): WeatherRepository
}