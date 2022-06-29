

package com.danny.mapswithgeofencing.network.response.geocode


import com.google.gson.annotations.SerializedName

data class Result(
        @SerializedName("address_components")
        val addressComponents: List<AddressComponent>,
        @SerializedName("formatted_address")
        val formattedAddress: String,
        @SerializedName("geometry")
        val geometry: Geometry,
        @SerializedName("place_id")
        val placeId: String,
        @SerializedName("plus_code")
        val plusCode: PlusCodeX,
        @SerializedName("postcode_localities")
        val postcodeLocalities: List<String>,
        @SerializedName("types")
        val types: List<String>
)