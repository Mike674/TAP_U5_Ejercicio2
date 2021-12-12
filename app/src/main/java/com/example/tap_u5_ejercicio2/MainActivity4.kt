package com.example.tap_u5_ejercicio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main4.*
import java.io.OutputStreamWriter
import java.lang.Exception

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        guardar.setOnClickListener{
            if(guardarEnMemoriaInterna(contenidoArchivo.text.toString()) == true){
                contenidoArchivo.setText("")
                AlertDialog.Builder(this)
                    .setTitle("EXITO")
                    .setMessage("Se guardó correctamente")
                    .setPositiveButton("OK", {d, i -> d.dismiss()})
                    .show()
            }

        }

        regresarArchivos.setOnClickListener {
            finish()
        }
    }

    fun guardarEnMemoriaInterna(content:String) : Boolean{
        if(content.isEmpty()){
            Toast.makeText(this, "ERROR: DEBES PONER UN ENUNCIADO", Toast.LENGTH_LONG)
                .show()
            return false
        }

        try {
            var flujoSalida = OutputStreamWriter( openFileOutput("almacen.txt", MODE_PRIVATE) )

            flujoSalida.write(content)
            flujoSalida.flush() //fuerza a que android guarde el archivo
            flujoSalida.close()
            return true
        }catch (io:Exception){
            AlertDialog.Builder(this)
                .setTitle("ERROR")
                .setMessage("No se pudo guardar el archivo")
                .show()
        }
        return false
    }
}