

package com.danny.mapswithgeofencing.ui.events

sealed class WeatherStateEvent {
    class OnFetchWeather(
            val hLat: Double?,
            val hLng: Double?
    ) : WeatherStateEvent()

    class OnFetchForecast(
            val hLat: Double?,
            val hLng: Double?
    ) : WeatherStateEvent()

    class None : WeatherStateEvent()
}