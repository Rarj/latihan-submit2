package com.grack.rapalll.submit2footbalmatch.network

import com.grack.rapalll.submit2footbalmatch.BuildConfig
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {
    companion object {
        fun getRetrofit(): Retrofit{
            return  Retrofit.Builder()
                    .baseUrl(BuildConfig.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
        }
    }
}