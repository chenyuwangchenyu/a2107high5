package com.wcy.hilt_demo.repository

import com.wcy.hilt_demo.service.UserApi
import javax.inject.Inject

class UserRemoteDataSource @Inject constructor(val userApi: UserApi) {
    suspend fun getUserInfo(){
        val userInfo = userApi.getUserInfo(0,1,5)//user
        println(userInfo.msg)
        println("get user info from remote")
    }
}