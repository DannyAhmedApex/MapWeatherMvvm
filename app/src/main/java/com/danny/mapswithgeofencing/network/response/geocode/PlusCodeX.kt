

package com.danny.mapswithgeofencing.network.response.geocode


import com.google.gson.annotations.SerializedName

data class PlusCodeX(
        @SerializedName("compound_code")
        val compoundCode: String,
        @SerializedName("global_code")
        val globalCode: String
)