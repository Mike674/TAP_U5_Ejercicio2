package com.example.tap_u5_ejercicio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        menuprincipal.setOnItemClickListener { parent, view, position, id ->
            //en JAVA Switch-case

            when(position){
                0 -> {
                    //Invocación de un segundo activity desde el principal
                    //el objeto Invent invoca un activity
                    var ventana2 = Intent(this, MainActivity2::class.java)
                    startActivity(ventana2)
                }
                1 -> {
                    //activity 3
                    val ventana3 = Intent(this, MainActivity3::class.java)
                    startActivity(ventana3)
                }
                2 -> {
                    //activity 4
                    val ventana4 = Intent(this, MainActivity4::class.java)
                    startActivity(ventana4)
                }
                3 -> {
                    //activity 5
                    val ventana5 = Intent(this, MainActivity5::class.java)
                    startActivity(ventana5)
                }
                4 -> { mensaje() }
                5 -> { cerrar() }
            }
        }
    }

    //construcción de un método
    //public void mensaje (tipo parametro)

    fun mensaje(){
        AlertDialog.Builder(this)
            .setTitle("Atención")
            .setMessage("(C) Reservados Ahumada-Covarrubias\nTec Tepic 2021")
            .setPositiveButton("OK", {d, i-> d.dismiss()})
            .show()
    }

    fun cerrar(){
        finish()
    }
    /*
    fun otrometodo(): int {
        var retorno = 9

        return retorno
    }

     */

}