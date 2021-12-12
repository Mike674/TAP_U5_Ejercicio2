package com.example.tap_u5_ejercicio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        button3.setOnClickListener{
            var txt = texto1.text.toString()
            var txt2 = texto2.text.toString()
            var txtResultado = txt+" "+txt2

            textView.setText(txtResultado)

            texto1.setText("")
            texto2.setText("")
        }
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //sirve para agregar al activity un menu contextual
        this.menuInflater.inflate(R.menu.menuoculto , menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.regresarMenu -> {
                finish()
            }
            R.id.acercademenu -> {
                Toast.makeText(this, "(C) Ahumada-Covarrubias", Toast.LENGTH_LONG)
                    .show()
            }
        }

        return true
    }
}