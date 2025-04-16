package com.sammyg.myapp.viewmodel

import android.R.attr.password
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.sammyg.myapp.repository.AuthRepository

class AuthViewModel(
    private val repository: AuthRepository = AuthRepository()
): ViewModel(){
    var isregistered by mutableStateOf< Boolean>(null)
        private set
    var isLoggedin by mutableStateOf< Boolean>(null)
        private set
    fun register(email:String, password:String)
    {
        repository.register(email,password){
            success->isregistered=success
        }
    }
    fun loginscreen(email: String, password: String){
        repository.login(email,password){
            success->isLoggedin=success
    }
    fun logout(){
        repository.logout()
        isLoggedin=false
    }
}
