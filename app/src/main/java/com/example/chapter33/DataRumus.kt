package com.example.chapter33

import android.os.Parcel
import android.os.Parcelable

data class DataRumus (val massa :Int , val percepatan :Int , val tinggi : Int) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(massa)
        parcel.writeInt(percepatan)
        parcel.writeInt(tinggi)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DataRumus> {
        override fun createFromParcel(parcel: Parcel): DataRumus {
            return DataRumus(parcel)
        }

        override fun newArray(size: Int): Array<DataRumus?> {
            return arrayOfNulls(size)
        }
    }
}
