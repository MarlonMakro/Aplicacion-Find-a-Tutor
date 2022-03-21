package com.example.aplicacionfindatutorec

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.aplicacionfindatutorec.databinding.ActivityLoginBinding
import com.google.android.material.textfield.TextInputLayout


class Login : AppCompatActivity() {
    private lateinit var binding : ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var parentLogin = binding.loginPrincipal

        parentLogin.setOnClickListener(){
            hideSoftKeyboard(binding.root)
        }

        binding.btnRegistrarse.setOnClickListener(){
            Toast.makeText(this,"Pantalla en construccion",Toast.LENGTH_SHORT).show()
        }


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