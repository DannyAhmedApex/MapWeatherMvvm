

package com.danny.mapswithgeofencing.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.danny.mapswithgeofencing.db.entities.Contact
import com.danny.mapswithgeofencing.db.entities.DbDao
import com.danny.mapswithgeofencing.db.entities.GeoFence
import com.danny.mapswithgeofencing.db.entities.Templates
import com.danny.mapswithgeofencing.utils.Constants.Companion.H_DATABASE

@Database(
        entities = [
            Contact::class,
            GeoFence::class,
            Templates::class,
        ],
        version = 1
)
abstract class Db : RoomDatabase() {
    abstract val hDbDao: DbDao

    companion object {
        @Volatile
        private var INSTANCE: Db? = null

        fun hGetInstance(context: Context): Db {
            synchronized(this) {
                return INSTANCE ?: Room.databaseBuilder(
                        context.applicationContext,
                        Db::class.java,
                        H_DATABASE,
                ).build().also {
                    INSTANCE = it
                }
            }
        }
    }
}