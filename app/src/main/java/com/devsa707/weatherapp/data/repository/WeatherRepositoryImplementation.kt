package com.devsa707.weatherapp.data.repository

import com.devsa707.weatherapp.data.mappers.toWeatherInfo
import com.devsa707.weatherapp.data.remote.WeatherAPI
import com.devsa707.weatherapp.domain.repository.WeatherRepository
import com.devsa707.weatherapp.domain.util.Resource
import com.devsa707.weatherapp.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImplementation @Inject constructor(
    private val api: WeatherAPI
) : WeatherRepository {
    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error ocurred.")
        }
    }

}