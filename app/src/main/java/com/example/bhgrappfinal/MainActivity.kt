package com.example.bhgrappfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.bhgrappfinal.databinding.ActivityConsultasBinding
import com.example.bhgrappfinal.databinding.ActivityMainBinding
import com.example.bhgrappfinal.databinding.ActivityRegistroBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun btningreso(view: View) {
          // para llamar al otro activity
        val actividadconsultas = Intent(this,Consultas::class.java)
        startActivity(actividadconsultas)
    }

    fun btnregistro(view: View) {
        val actividadregistro = Intent(this,Registro::class.java)
        startActivity(actividadregistro)
    }
}