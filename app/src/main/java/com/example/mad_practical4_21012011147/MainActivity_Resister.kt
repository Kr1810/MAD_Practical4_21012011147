package com.example.mad_practical4_21012011147
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
class MainActivity_Resister : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_resister)
        val login:Button=findViewById(R.id.signuptologin)
        login.setOnClickListener{
            Intent(this,MainActivity_Login::class.java).also {
                startActivity(it)
            }
        }
    }
}