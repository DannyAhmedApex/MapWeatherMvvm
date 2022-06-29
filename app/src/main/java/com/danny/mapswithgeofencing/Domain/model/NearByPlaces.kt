
package com.danny.mapswithgeofencing.Domain.model

import com.danny.mapswithgeofencing.network.response.nearybyplaces.Photo

data class NearByPlaces(
        val userRatingsTotal: Int? = null,
        val icon: String? = null,
        val name: String? = null,
        val placeId: String? = null,
        val photos: List<Photo>? = null,
        val rating: Double? = null,
        val types: List<String>? = null,
        val lat: Double? = null,
        val lng: Double? = null
)

