

package com.danny.mapswithgeofencing.repository.mappers

import com.danny.mapswithgeofencing.Domain.model.PlaceSuggestions
import com.danny.mapswithgeofencing.Domain.util.DomainMapper
import com.danny.mapswithgeofencing.network.response.placesuggestions.Prediction

class PlaceSuggestionDtoMapper : DomainMapper<Prediction, PlaceSuggestions> {
    override fun hMapToDomainModel(model: Prediction): PlaceSuggestions {
        return PlaceSuggestions(
                model.description,
                model.placeId,
        )
    }

    override fun hMapFromDomailModel(domainModel: PlaceSuggestions): Prediction {
        TODO("Not yet implemented")
    }

    fun hToDomainList(predications: List<Prediction>): List<PlaceSuggestions> {
        return predications.map {
            hMapToDomainModel(it)
        }
    }


}