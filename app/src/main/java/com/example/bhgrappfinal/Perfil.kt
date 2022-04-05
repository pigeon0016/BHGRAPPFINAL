package com.example.bhgrappfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.bhgrappfinal.databinding.ActivityConsultasBinding
import com.example.bhgrappfinal.databinding.ActivityPerfilBinding

class Perfil : AppCompatActivity() {
    private lateinit var binding: ActivityPerfilBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPerfilBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun btnhome(view: View) {
        val actividadhome = Intent(this, Consultas::class.java)
        startActivity(actividadhome)
    }
}