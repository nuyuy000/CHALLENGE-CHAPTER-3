package com.example.chapter33

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DataRumus (var massa :Int , var percepatan :Int , var tinggi : Int) : Parcelable
