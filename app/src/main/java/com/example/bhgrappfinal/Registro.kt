package com.example.bhgrappfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.bhgrappfinal.databinding.ActivityConsultasBinding
import com.example.bhgrappfinal.databinding.ActivityMainBinding
import com.example.bhgrappfinal.databinding.ActivityPerfilBinding
import com.example.bhgrappfinal.databinding.ActivityRegistroBinding

class Registro : AppCompatActivity() {
    private lateinit var binding: ActivityRegistroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun btnregistrar(view: View) {
        val actividadregistrar = Intent(this, Registro::class.java)
        startActivity(actividadregistrar)
    }
}