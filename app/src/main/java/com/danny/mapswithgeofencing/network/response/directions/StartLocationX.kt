

package com.danny.mapswithgeofencing.network.response.directions


import com.google.gson.annotations.SerializedName

data class StartLocationX(
        @SerializedName("lat")
        val lat: Double,
        @SerializedName("lng")
        val lng: Double
)