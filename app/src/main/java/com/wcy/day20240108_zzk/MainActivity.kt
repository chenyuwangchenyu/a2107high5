package com.wcy.day20240108_zzk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wcy.day20240108_zzk.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}