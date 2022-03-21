package com.example.aplicacionfindatutorec

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import com.example.aplicacionfindatutorec.databinding.ActivityLoginBinding
import com.google.android.material.textfield.TextInputLayout


class Login : AppCompatActivity() {
    private lateinit var binding : ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var parentLogin = binding.loginPrincipal

        var btnLogin = findViewById<Button>(R.id.btnLogin)
        var txtEmail=findViewById<EditText>(R.id.txtLogin)
        var txtPassword=findViewById<EditText>(R.id.txtPassword)
        var emailField =findViewById<TextInputLayout>(R.id.emailField)
        var passwordField=findViewById<TextInputLayout>(R.id.passwordField)

        binding.btnLogin.setOnClickListener(){
            if (binding.txtLogin.text.toString().trim()=="")
            {
                binding.emailField.error= "Email incorrecto"
            }
            else if (binding.txtPassword.text.toString().trim()=="")
            {
                binding.emailField.error= "Contraseña incorrecto"
            }
            else
            {
                binding.emailField.error =null

                var intent = Intent(this, Navegacion::class.java)
                startActivity(intent)
}
        }
        binding.loginPrincipal.setOnClickListener(){
            hideSoftKeyboard(binding.root)
        }

    }
    fun hideSoftKeyboard (view: View){
        val imm =
            getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

}