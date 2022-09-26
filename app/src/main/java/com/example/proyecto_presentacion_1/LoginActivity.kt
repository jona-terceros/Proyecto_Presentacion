package com.example.proyecto_presentacion_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import androidx.lifecycle.Observer

class LoginActivity : AppCompatActivity(), IUserView {
    lateinit var loginViewModel: LoginViewModel
    lateinit var progressBar : ProgressBar
    lateinit var buttonLogin: Button
    lateinit var userNameEditText: EditText
    lateinit var passwordEditText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        progressBar = findViewById(R.id.progressBar)

        loginViewModel = LoginViewModel( LoginRepository())
        loginViewModel.model.observe(this, Observer(::updateUi))

        buttonLogin = findViewById(R.id.button_Login)
        userNameEditText = findViewById(R.id.user_name_edit_text)
        passwordEditText = findViewById(R.id.password_edit_text)
        buttonLogin.setOnClickListener{
            loginViewModel.doLogin(userNameEditText.text.toString(),passwordEditText.text.toString())
            startActivity(Intent(this, HomeActivity::class.java))
        }

    }
    override fun navigateToHome(){

        val intent = Intent(this,HomeActivity::class.java )
        startActivity(intent)
    }

    private fun updateUi(uiModel: LoginViewModel.UiModel) {
        if (uiModel is LoginViewModel.UiModel.Loading) {
            progressBar.visibility = View.VISIBLE
        }else{
            progressBar.visibility = View.GONE
        }
        when(uiModel){
            is LoginViewModel.UiModel.Login -> showMessage(uiModel.resp)

        }
    }

    private fun showMessage(resp: String) {
        Toast.makeText( this,resp, Toast.LENGTH_LONG).show()

    }



}