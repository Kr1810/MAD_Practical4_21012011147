package com.example.mad_practical4_21012011147

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mad_practical4_21012011147.R
import kotlin.math.sign
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val login:Button=findViewById(R.id.button)
        login.setOnClickListener {
            Intent(this,MainActivity_Login::class.java).also {
                startActivity(it)
            }
        }
        val signup:Button=findViewById(R.id.button2)
        signup.setOnClickListener {
            Intent(this,MainActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}
