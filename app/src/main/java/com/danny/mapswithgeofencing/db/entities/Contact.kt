

package com.danny.mapswithgeofencing.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Contact(
        @PrimaryKey(autoGenerate = false)
        val hNumber: String,
        val hName: String? = null,

        )