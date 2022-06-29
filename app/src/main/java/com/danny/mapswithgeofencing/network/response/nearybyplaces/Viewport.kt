

package com.danny.mapswithgeofencing.network.response.nearybyplaces


import com.google.gson.annotations.SerializedName


data class Viewport(
        @SerializedName("northeast")
        val northeast: Northeast,
        @SerializedName("southwest")
        val southwest: Southwest
)