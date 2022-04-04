package com.example.bhgrappfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.bhgrappfinal.databinding.ActivitySplashBinding
import kotlin.concurrent.thread

class Splash : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding  // estoy poniendolo quie lo voy a necsitar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)


        ////////////////////// 00 PARA EL SPLASH
        thread{
            Thread.sleep(3000)
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish() // con esto se termina lo que se ejecuta del splash
        }////////////////////00 //////////////


    }
}