package com.wiwi.proyecto_presentacion_1


class LoginRepository(){
    fun login(userName: String, password: String): String{
        if(userName.equals("jona") and password.equals("jona123")){
            return "Credenciales Correctos"

        }
        return "Credenciales incorrectos"
    }
}