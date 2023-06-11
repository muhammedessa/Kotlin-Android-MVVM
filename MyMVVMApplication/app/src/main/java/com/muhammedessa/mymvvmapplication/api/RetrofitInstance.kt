package com.muhammedessa.mymvvmapplication.api

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create


private const val BASE_URL = "https://jsonplaceholder.typicode.com/"

object RetrofitInstance {

    private val retrofit by lazy{

        Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create()).build()
    }

    val api: PostAPI by lazy {
        retrofit.create(PostAPI::class.java)
    }

}