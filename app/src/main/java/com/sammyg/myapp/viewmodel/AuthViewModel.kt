package com.sammyg.myapp.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.sammyg.myapp.repository.AuthRepository

class AuthViewModel (
    private val repository: AuthRepository = AuthRepository()
    ): ViewModel(){
        var isRegistered by mutableStateOf< Boolean?>(null) private set
    }