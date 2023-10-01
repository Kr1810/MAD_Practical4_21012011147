package com.example.mad_practical4_21012011147

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity_Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_login)
        val signup:Button=findViewById(R.id.button)
        signup.setOnClickListener{
            Intent(this,MainActivity_Resister::class.java).also {
                startActivity(it)}
        }
    }
}