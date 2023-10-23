package com.petsaverapp.petsaver.database_materia.model

import androidx.room.TypeConverter
import java.util.Date

class Conversor {
    @TypeConverter
    fun fromTimestamp(value: Long?): Date? {
        return value?.let { Date(it) }
    }

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? {
        return date?.time?.toLong()
    }
}