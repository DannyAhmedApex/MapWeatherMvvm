

package com.danny.mapswithgeofencing.repository.mappers

import com.danny.mapswithgeofencing.Domain.model.GeoCode
import com.danny.mapswithgeofencing.Domain.util.DomainMapper
import com.danny.mapswithgeofencing.network.response.geocode.Result

class GeoCodeDtoMapper : DomainMapper<Result, GeoCode> {
    override fun hMapToDomainModel(model: Result): GeoCode {

        return GeoCode(
                formattedAddress = model.formattedAddress,
                location = model.geometry.location,
                placeId = model.placeId,
        )
    }

    override fun hMapFromDomailModel(domainModel: GeoCode): Result {
        TODO("Not yet implemented")
    }

    fun hToDomainList(results: List<Result>): List<GeoCode> {
        return results.map {
            hMapToDomainModel(it)
        }
    }
}