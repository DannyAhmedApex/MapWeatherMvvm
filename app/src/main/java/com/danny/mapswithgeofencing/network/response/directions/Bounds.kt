

package com.danny.mapswithgeofencing.network.response.directions


import com.google.gson.annotations.SerializedName

data class Bounds(
        @SerializedName("northeast")
        val northeast: Northeast,
        @SerializedName("southwest")
        val southwest: Southwest
)