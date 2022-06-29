

package com.danny.mapswithgeofencing.repository.local

import com.danny.mapswithgeofencing.db.entities.Contact
import com.danny.mapswithgeofencing.db.entities.GeoFence
import com.danny.mapswithgeofencing.db.entities.Templates

interface LocalRepo {

    suspend fun hInsertContact(Contact: Contact): Long

    suspend fun hGetAllContacts(): List<Contact>

    suspend fun hInsertGeoFence(geoFence: GeoFence): Long

    suspend fun hGetAllGeoFences(): List<GeoFence>

    suspend fun hInsertTemplate(templates: Templates): Long

    suspend fun hGetTemplates(): List<Templates>

}