package com.example.chapter33

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DataRumus (var radius :Int , var diameter :Int , var tinggi : Int, var volume : Int) : Parcelable
