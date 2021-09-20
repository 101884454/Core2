package com.example.core2

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
//create movie class
@Parcelize
class movie_details(
    val title: String, val studio: String, val director: String,
    val release: String, var rating: String
): Parcelable