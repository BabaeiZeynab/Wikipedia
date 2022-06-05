package com.zeynab.wikipedia.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

//Here we will write all the data that we want to pot in explore_fragmnets
// which are incluse img String kind and 3 others String which are title, subTitle, details
@Parcelize
data class ItemPost (

    val imgURL :String,
     val txtTitle :String,
     val txtSubTitle : String,
     val txtDetails: String,

     // for Trend Fragmnet we will use all up values plus dbelow

     val isTrend : Boolean,
     val insight : String,

     //these are for trend Expand side

     val born : String,
     val active : String,
     val life : String,
    ): Parcelable