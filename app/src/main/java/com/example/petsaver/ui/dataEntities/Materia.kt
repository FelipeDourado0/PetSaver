package com.example.petsaver.ui.dataEntities

import android.os.Parcel
import android.os.Parcelable

data class Materia(
    var title: String,
    var subTitle: String,
    var mainText: String,
    var tema: String,
    var voceSabiaList: Boolean,
    var exploreList: Boolean

): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readByte() != 0.toByte(),
        parcel.readByte() != 0.toByte()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeString(subTitle)
        parcel.writeString(mainText)
        parcel.writeByte(if (voceSabiaList) 1 else 0)
        parcel.writeByte(if (exploreList) 1 else 0)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Materia> {
        override fun createFromParcel(parcel: Parcel): Materia {
            return Materia(parcel)
        }

        override fun newArray(size: Int): Array<Materia?> {
            return arrayOfNulls(size)
        }
    }
}
