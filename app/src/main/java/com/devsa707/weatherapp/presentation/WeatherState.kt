package com.devsa707.weatherapp.presentation

import com.devsa707.weatherapp.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading : Boolean = false,
    val error : String? = null
)