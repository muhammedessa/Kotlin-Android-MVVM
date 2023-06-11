package com.muhammedessa.mypasta.api

import okhttp3.Interceptor
import okhttp3.Response

class HeaderInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
            .newBuilder()
            .addHeader("User-Agent", "My Post API")
            .build()
        return chain.proceed(request)
    }

}
