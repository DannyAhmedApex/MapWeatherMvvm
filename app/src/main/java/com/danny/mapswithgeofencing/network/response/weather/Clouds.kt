

package com.danny.mapswithgeofencing.network.response.weather


import com.google.gson.annotations.SerializedName

data class Clouds(
        @SerializedName("all")
        val all: Int
)