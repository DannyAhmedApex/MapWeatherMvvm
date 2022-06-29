
package com.danny.mapswithgeofencing.Domain.util

interface DomainMapper<T, DomainModel> {

    fun hMapToDomainModel(model: T): DomainModel

    fun hMapFromDomailModel(domainModel: DomainModel): T
}