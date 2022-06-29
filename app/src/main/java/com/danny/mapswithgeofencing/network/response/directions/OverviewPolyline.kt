

package com.danny.mapswithgeofencing.network.response.directions


import com.google.gson.annotations.SerializedName

data class OverviewPolyline(
        @SerializedName("points")
        val points: String
)