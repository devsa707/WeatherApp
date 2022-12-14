package com.devsa707.weatherapp.domain.repository

import com.devsa707.weatherapp.di.util.Resource
import com.devsa707.weatherapp.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}