package com.grack.rapalll.submit2footbalmatch.network

import com.grack.rapalll.submit2footbalmatch.BuildConfig
import com.grack.rapalll.submit2footbalmatch.model.EventResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("api/v1/json/${BuildConfig.TSBD_API_KEY}/eventsnextleague.php?id=4328")
    fun getNextMatch(): Call<EventResponse>
}