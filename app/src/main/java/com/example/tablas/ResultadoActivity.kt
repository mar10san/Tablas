package com.example.tablas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.airbnb.lottie.LottieAnimationView

class ResultadoActivity : AppCompatActivity() {
    lateinit var animView: LottieAnimationView
    lateinit var btnRegresar:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        btnRegresar = findViewById(R.id.btnRegresar)
        btnRegresar.setOnClickListener {
            val intentPracticar = Intent(this,PracticaActivity::class.java)
            startActivity(intentPracticar)
        }
        animView = findViewById(R.id.animation_view)
        val extras = intent.extras
        val respuestaCorrecta = extras!!.getBoolean("respuesta")
        if(respuestaCorrecta){
            animView.setAnimation(R.raw.correcto)
        }else{
            animView.setAnimation(R.raw.opops)

        }

    }
}