

package com.danny.mapswithgeofencing.repository.remote

import android.location.Location
import com.google.android.gms.maps.model.LatLng
import com.danny.mapswithgeofencing.Domain.model.*
import com.danny.mapswithgeofencing.ui.calculateroute.DirectionsMode
import com.danny.mapswithgeofencing.ui.main.fragments.adapter.Category

interface RemoteRepo {

    suspend fun hGetWeather(
            location: Location,
            unitType: String
    ): Weather

    suspend fun hGetForecast(
            location: Location,
            unitType: String
    ): Forecast

    suspend fun hGetDirections(
            startLocation: Location,
            endLocation: Location,
            mode: DirectionsMode,
    ): Directions

    suspend fun hFindNearybyPlaces(
            category: Category,
            location: Location,
            radius: Int
    ): List<NearByPlaces>


    suspend fun hReverseGeoCode(
            latLng: LatLng,
    ): List<GeoCode>


    suspend fun hGetPlacesAutoComplete(
            query: String,
            radius: Int? = null
    ): List<PlaceSuggestions>
}