

package com.danny.mapswithgeofencing.network.response.geocode


import com.google.gson.annotations.SerializedName

data class Viewport(
        @SerializedName("northeast")
        val northeast: NortheastX,
        @SerializedName("southwest")
        val southwest: SouthwestX
)