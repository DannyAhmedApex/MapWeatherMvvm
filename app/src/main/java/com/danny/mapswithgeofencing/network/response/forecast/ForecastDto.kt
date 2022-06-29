

package com.danny.mapswithgeofencing.network.response.forecast


import com.google.gson.annotations.SerializedName

data class ForecastDto(
        @SerializedName("city")
        val city: City,
        @SerializedName("cnt")
        val cnt: Int,
        @SerializedName("cod")
        val cod: String,
        @SerializedName("list")
        val list: List<ForecastList>,
        @SerializedName("message")
        val message: Int
)