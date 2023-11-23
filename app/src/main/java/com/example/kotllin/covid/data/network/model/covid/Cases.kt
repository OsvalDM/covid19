package com.example.kotllin.covid.data.network.model.covid

import com.google.gson.annotations.SerializedName

data class Cases(
    @SerializedName("2020-03-20") val date20200320: X20200122,
    @SerializedName("2020-03-21") val date20200321: X20200122,
    @SerializedName("2020-03-22") val date20200322: X20200122,
    @SerializedName("2020-03-23") val date20200323: X20200122,
    @SerializedName("2020-03-24") val date20200324: X20200122,
    @SerializedName("2020-03-25") val date20200325: X20200122,
    @SerializedName("2020-03-26") val date20200326: X20200122,
    @SerializedName("2020-03-27") val date20200327: X20200122,
    @SerializedName("2020-03-28") val date20200328: X20200122,
    @SerializedName("2020-03-29") val date20200329: X20200122,
    @SerializedName("2020-03-30") val date20200330: X20200122,
    @SerializedName("2020-03-31") val date20200331: X20200122,
    @SerializedName("2020-12-31") val final20: X20200122,
    @SerializedName("2021-12-31") val final21: X20200122,
    @SerializedName("2022-12-31") val final22: X20200122,
    @SerializedName("2023-03-09") val final: X20200122,

    )