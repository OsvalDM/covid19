package com.example.kotllin.covid.data.network.model.covid

import com.google.gson.annotations.SerializedName

data class Cases(
    @SerializedName("2020-01-22") val date20200122: X20200122,
    @SerializedName("2020-01-23") val date20200123: X20200122,
    @SerializedName("2020-01-24") val date20200124: X20200122,
    @SerializedName("2020-01-25") val date20200125: X20200122,
    @SerializedName("2020-01-26") val date20200126: X20200122,
    @SerializedName("2020-01-27") val date20200127: X20200122,
    @SerializedName("2020-01-28") val date20200128: X20200122,
    @SerializedName("2020-01-29") val date20200129: X20200122,
    @SerializedName("2020-01-30") val date20200130: X20200122,
    @SerializedName("2020-01-31") val date20200131: X20200122
)