package com.example.loginwithmvvm.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.loginwithmvvm.model.User
import com.example.loginwithmvvm.sharedPreference.Provider

class Repository {

    private val sharedPreferences = Provider

    fun addUser(user: User) {
        sharedPreferences.setUserPass(user.username, user.pass)
    }

    fun getUserName() = sharedPreferences.getUserName()
    fun getPassword() = sharedPreferences.getPassword()
}