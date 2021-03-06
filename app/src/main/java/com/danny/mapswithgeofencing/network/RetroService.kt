

package com.danny.mapswithgeofencing.network

import com.danny.mapswithgeofencing.network.RetroConstants.Companion.H_DIRECTIONS_URL
import com.danny.mapswithgeofencing.network.RetroConstants.Companion.H_GEO_CODE_URL
import com.danny.mapswithgeofencing.network.RetroConstants.Companion.H_GET_FORECAST_URL
import com.danny.mapswithgeofencing.network.RetroConstants.Companion.H_GET_WEATHER_URL
import com.danny.mapswithgeofencing.network.RetroConstants.Companion.H_NEARBY_PLACES_URL
import com.danny.mapswithgeofencing.network.RetroConstants.Companion.H_PLACES_AUTOCOMPLETE_URL
import com.danny.mapswithgeofencing.network.response.directions.DirectionsDto
import com.danny.mapswithgeofencing.network.response.forecast.ForecastDto
import com.danny.mapswithgeofencing.network.response.geocode.GeocodeDto
import com.danny.mapswithgeofencing.network.response.nearybyplaces.NearByPlacesDto
import com.danny.mapswithgeofencing.network.response.placesuggestions.PlaceSuggestionsDto
import com.danny.mapswithgeofencing.network.response.weather.WeatherDto
import retrofit2.http.GET
import retrofit2.http.Query

interface RetroService {
    @GET(H_GET_WEATHER_URL)
    suspend fun hGetWeather(
            @Query("lat") lat: String,
            @Query("lon") lng: String,
            @Query("APPID") key: String,
            @Query("units") unit: String
    ): WeatherDto


    @GET(H_GET_FORECAST_URL)
    suspend fun hGetForecast(
            @Query("lat") lat: String,
            @Query("lon") lng: String,
            @Query("APPID") key: String,
            @Query("units") unit: String
    ): ForecastDto


    @GET(H_NEARBY_PLACES_URL)
    suspend fun hFindNearByPlaces(
            @Query("location") location: String,
            @Query("radius") radius: String,
            @Query("type") type: String,
            @Query("key") key: String,
    ): NearByPlacesDto

    @GET(H_DIRECTIONS_URL)
    suspend fun hFindDirections(
            @Query("origin") startLocation: String,
            @Query("destination") endLocation: String,
            @Query("key") key: String,
            @Query("mode") mode: String,
    ): DirectionsDto


    @GET(H_GEO_CODE_URL)
    suspend fun hGeoCode(
            @Query("latlng") latLng: String,
            @Query("key") key: String,
    ): GeocodeDto


    @GET(H_PLACES_AUTOCOMPLETE_URL)
    suspend fun hGetPlacesAutoComplete(
            @Query("input") inputText: String,
            @Query("key") key: String,
            @Query("origin") origin: String? = null, // pass lat,lng
            @Query("radius") radius: String? = null, // in meters
    ): PlaceSuggestionsDto
}