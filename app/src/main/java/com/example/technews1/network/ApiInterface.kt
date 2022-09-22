package com.example.technews1.network

import com.example.technews1.model.LoginRequest
import com.example.technews1.model.LoginResponse
import com.example.technews1.model.News
import com.example.technews1.model.User
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST


interface ApiInterface {


    @POST("/login")
    suspend fun signIn(@Body login : LoginRequest): Response<LoginResponse>

    @POST("/register")
    suspend fun signUp(@Body user : User): Response<User>

    @GET("/news/all")
    suspend fun getAllNews(@Header("Authorization") authHeader:String): Response<MutableList<News>>
}