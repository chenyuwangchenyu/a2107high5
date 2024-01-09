package com.wcy.hilt_demo.di

import com.wcy.hilt_demo.service.UserApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class HttpModule {

    @Provides
    @Singleton
    fun provideUserRemoteDataSourcer(retrofit: Retrofit): UserApi {
        return retrofit.create(UserApi::class.java)
    }

    @Provides
    @Singleton
    fun provideFengRemoteDataSource(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("http://10.161.9.80:9999/")
            .client(
                OkHttpClient().newBuilder().addInterceptor(
                HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
            ).build())
            .addConverterFactory(GsonConverterFactory.create()) //把字符串转化成类的工厂
            .build()
    }
}