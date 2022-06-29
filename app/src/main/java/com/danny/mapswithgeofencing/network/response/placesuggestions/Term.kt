

package com.danny.mapswithgeofencing.network.response.placesuggestions


import com.google.gson.annotations.SerializedName

data class Term(
    @SerializedName("offset")
    val offset: Int,
    @SerializedName("value")
    val value: String
)