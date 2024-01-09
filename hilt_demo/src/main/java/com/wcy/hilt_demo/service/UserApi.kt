package com.wcy.hilt_demo.service

import com.wcy.hilt_demo.entity.response.Banner
import retrofit2.http.GET
import retrofit2.http.Query

interface UserApi {
    @GET("/banner/select")
    suspend fun getUserInfo(@Query("type") type: Int, @Query("page") page: Int, @Query("pageSize") pageSize: Int): Banner
}