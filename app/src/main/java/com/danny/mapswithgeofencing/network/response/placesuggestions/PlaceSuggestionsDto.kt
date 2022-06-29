

package com.danny.mapswithgeofencing.network.response.placesuggestions


import com.google.gson.annotations.SerializedName

data class PlaceSuggestionsDto(
    @SerializedName("predictions")
    val predictions: List<Prediction>,
    @SerializedName("status")
    val status: String
)