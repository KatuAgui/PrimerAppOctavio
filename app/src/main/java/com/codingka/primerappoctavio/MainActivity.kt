package com.codingka.primerappoctavio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btnAgregar: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txtNombre: TextView = findViewById(R.id.txtSaludo)
        val edtNombre = findViewById<EditText>(R.id.edtNombre)
        btnAgregar = findViewById(R.id.btnAgregar)

        btnAgregar.setOnClickListener{
            val toast = Toast.makeText(this,"Haz hecho clic en el boton",Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}