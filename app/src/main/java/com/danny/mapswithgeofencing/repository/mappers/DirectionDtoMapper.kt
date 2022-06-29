

package com.danny.mapswithgeofencing.repository.mappers

import com.danny.mapswithgeofencing.Domain.model.Directions
import com.danny.mapswithgeofencing.Domain.util.DomainMapper
import com.danny.mapswithgeofencing.network.response.directions.DirectionsDto

class DirectionDtoMapper : DomainMapper<DirectionsDto, Directions> {
    override fun hMapToDomainModel(model: DirectionsDto): Directions {
        return Directions(
                model.routes.get(0).bounds,
                model.routes.get(0).overviewPolyline,
                model.routes.get(0).legs.get(0).distance,
                model.routes.get(0).legs.get(0).duration,
                model.routes.get(0).legs.get(0).endAddress,
                model.routes.get(0).legs.get(0).endLocation,
                model.routes.get(0).legs.get(0).startAddress,
                model.routes.get(0).legs.get(0).startLocation,
                model.routes.get(0).legs.get(0).steps,
                model.status,
        )
    }

    override fun hMapFromDomailModel(domainModel: Directions): DirectionsDto {
        TODO("Not yet implemented")
    }
}