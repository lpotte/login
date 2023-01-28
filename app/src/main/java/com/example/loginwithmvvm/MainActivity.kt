package com.example.loginwithmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginwithmvvm.sharedPreference.Provider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Provider.initialize(this)
        setContentView(R.layout.activity_main)
    }
}