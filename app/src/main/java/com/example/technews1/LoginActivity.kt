package com.example.technews1
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.technews1.databinding.ActivityLoginBinding



class LoginActivity : AppCompatActivity() {

     private  lateinit var binding :ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.signInButton.setOnClickListener {

            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }



    }
}