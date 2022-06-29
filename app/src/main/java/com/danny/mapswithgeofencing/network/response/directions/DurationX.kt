

package com.danny.mapswithgeofencing.network.response.directions


import com.google.gson.annotations.SerializedName

data class DurationX(
        @SerializedName("text")
        val text: String,
        @SerializedName("value")
        val value: Int
)