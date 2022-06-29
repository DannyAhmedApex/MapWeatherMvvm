

package com.danny.mapswithgeofencing.network.response.directions


import com.google.gson.annotations.SerializedName

data class Northeast(
        @SerializedName("lat")
        val lat: Double,
        @SerializedName("lng")
        val lng: Double
)