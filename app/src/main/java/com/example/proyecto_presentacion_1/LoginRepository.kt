package com.example.proyecto_presentacion_1

import android.content.Intent
import androidx.core.content.ContextCompat.startActivity


class LoginRepository(){
    fun login(userName: String, password: String): String{
        if(userName.equals("jona") and password.equals("jona123")){
            return "Credenciales Correctos"

        }
        return "Credenciales incorrectos"
    }
}