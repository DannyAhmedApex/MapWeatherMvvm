

package com.danny.mapswithgeofencing.Domain.model

import com.danny.mapswithgeofencing.network.response.forecast.City
import com.danny.mapswithgeofencing.network.response.forecast.ForecastList

data class Forecast(val city: City, val list: List<ForecastList>)
