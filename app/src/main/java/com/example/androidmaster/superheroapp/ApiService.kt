package com.example.androidmaster.superheroapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    //CORUTINAAAAAA para retrofit
    @GET("/api/3b0fae495e6fae0f47875bafd0941384/search/{name}")
    suspend fun getSuperheroes(@Path("name") superheroName: String):Response<SuperHeroDataResponse>

    @GET("/api/3b0fae495e6fae0f47875bafd0941384/{id}")
    suspend fun getSuperheroDetail(@Path("id") superheroId:String):Response<SuperHeroDetailResponse>

}