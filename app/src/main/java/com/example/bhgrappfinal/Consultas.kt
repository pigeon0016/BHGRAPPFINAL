package com.example.bhgrappfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.bhgrappfinal.databinding.ActivityConsultasBinding
import com.example.bhgrappfinal.databinding.ActivityPerfilBinding

class Consultas : AppCompatActivity() {
    private lateinit var binding: ActivityConsultasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConsultasBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun btnperfil(view: View) {
        val actividadperfil = Intent(this, Perfil::class.java)
        startActivity(actividadperfil)

    }
}