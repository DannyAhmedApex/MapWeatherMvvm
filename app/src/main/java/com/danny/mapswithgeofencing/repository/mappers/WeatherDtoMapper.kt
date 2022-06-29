

package com.danny.mapswithgeofencing.repository.mappers

import com.danny.mapswithgeofencing.Domain.model.Weather
import com.danny.mapswithgeofencing.Domain.util.DomainMapper
import com.danny.mapswithgeofencing.network.response.weather.WeatherDto

class WeatherDtoMapper : DomainMapper<WeatherDto, Weather> {
    override fun hMapToDomainModel(model: WeatherDto): Weather {
        return Weather(
                lat = model.coord.lat,
                lon = model.coord.lon,
                description = model.weather.get(0).description,
                icon = model.weather.get(0).icon,
                main = model.weather.get(0).main,
                temp = model.main.temp,
                tempMax = model.main.tempMax,
                tempMin = model.main.tempMin,
                feelsLike = model.main.feelsLike,
                humidity = model.main.humidity,
                pressure = model.main.pressure,
                speed = model.wind.speed,
                sunrise = model.sys.sunrise,
                sunset = model.sys.sunset,
                country = model.sys.country
        )
    }

    override fun hMapFromDomailModel(domainModel: Weather): WeatherDto {
        TODO("Not yet implemented")
    }
}