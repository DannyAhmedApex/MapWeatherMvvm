

package com.danny.mapswithgeofencing.utils.geofencing

data class GeoData(
        val errorCode: Int? = null,
        val geofenceTransition: Int? = null,
        val latitude: Double? = null,
        val longitude: Double? = null,
        val bearing: Float? = null,
        val speed: Float? = null,
        val toList: List<String>? = null,
)