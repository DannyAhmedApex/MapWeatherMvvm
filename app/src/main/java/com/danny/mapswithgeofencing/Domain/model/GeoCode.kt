

package com.danny.mapswithgeofencing.Domain.model

import com.danny.mapswithgeofencing.network.response.geocode.Location

data class GeoCode(
        val status: String? = null,
        val formattedAddress: String? = null,
        val location: Location? = null,
        val placeId: String? = null,
)
