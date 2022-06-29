

package com.danny.mapswithgeofencing.network.response.geocode


import com.google.gson.annotations.SerializedName

data class SouthwestX(
        @SerializedName("lat")
        val lat: Double,
        @SerializedName("lng")
        val lng: Double
)