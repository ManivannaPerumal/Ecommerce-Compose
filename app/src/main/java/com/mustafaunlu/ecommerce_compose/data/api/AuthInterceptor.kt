package com.mustafaunlu.ecommerce_compose.data.api

import android.util.Log
import android.util.Log.VERBOSE
import com.mustafaunlu.ecommerce_compose.common.TokenManager
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import javax.inject.Inject

class AuthInterceptor @Inject constructor(private val tokenManager: TokenManager) : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder()

        if (tokenManager.isTokenValid()) {
            val token = tokenManager.getToken()
            request.addHeader("Authorization", "Bearer $token")
        } else {
            Log.d("AuthInterceptor", "Token is not valid")
            tokenManager.deleteToken()
        }

        return chain.proceed(request.build())
    }
}

fun createHttpLoggingInterceptor(): HttpLoggingInterceptor {
    return HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }
}