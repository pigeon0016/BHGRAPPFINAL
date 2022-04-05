package com.example.bhgrappfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.bhgrappfinal.databinding.ActivityConsultasBinding
import com.example.bhgrappfinal.databinding.ActivityDetalleBinding
import com.example.bhgrappfinal.databinding.ActivityPerfilBinding

class Detalle : AppCompatActivity() {
    private lateinit var binding: ActivityDetalleBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalleBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun btnperfil(view: View) {
        val actividadperfil = Intent(this, Perfil::class.java)
        startActivity(actividadperfil)
    }
    fun btnhome(view: View) {
        val actividadhome = Intent(this, Consultas::class.java)
        startActivity(actividadhome)
    }

}