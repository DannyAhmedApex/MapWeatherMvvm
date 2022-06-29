

package com.danny.mapswithgeofencing.repository.mappers

import com.danny.mapswithgeofencing.Domain.model.Forecast
import com.danny.mapswithgeofencing.Domain.util.DomainMapper
import com.danny.mapswithgeofencing.network.response.forecast.ForecastDto

class ForecastDtoMapper : DomainMapper<ForecastDto, Forecast> {
    override fun hMapToDomainModel(model: ForecastDto): Forecast {
        return Forecast(
                city = model.city,
                list = model.list
        )
    }

    override fun hMapFromDomailModel(domainModel: Forecast): ForecastDto {
        TODO("Not yet implemented")
    }

}