

package com.danny.mapswithgeofencing.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class GeoFence(
        @PrimaryKey(autoGenerate = true) val hPk: Int?,
        @ColumnInfo(name = "fenceName") val hFenceName: String,
        @ColumnInfo(name = "lat") val hLat: Double,
        @ColumnInfo(name = "lng") val hLng: Double,
) {
    constructor(hFenceName: String, hLat: Double, hLng: Double) : this(null, hFenceName, hLat, hLng)
}