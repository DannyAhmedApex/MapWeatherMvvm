

package com.danny.mapswithgeofencing.network.response.directions


import com.google.gson.annotations.SerializedName

data class DirectionsDto(
        @SerializedName("geocoded_waypoints")
        val geocodedWaypoints: List<GeocodedWaypoint>,
        @SerializedName("routes")
        val routes: List<Route>,
        @SerializedName("status")
        val status: String
)