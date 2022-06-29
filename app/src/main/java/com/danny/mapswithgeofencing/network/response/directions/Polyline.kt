

package com.danny.mapswithgeofencing.network.response.directions


import com.google.gson.annotations.SerializedName

data class Polyline(
        @SerializedName("points")
        val points: String
)