package com.imie.rolandgarros

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_creation_joueur.*


/**
 * Created by ElMou on 26/09/2017.
 */
class CreationJoueurActivity : AppCompatActivity() {

//    var spinner: Spinner? = null
    var sexe = arrayOf("   ", "Féminin", "masculin")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_creation_joueur)

        bt_back_creation_joueur.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, CreationActivity::class.java)
            startActivity(intent)
        }

        val spinner: Spinner = findViewById(R.id.spinner)
        val aa: ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_spinner_item, sexe)
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = aa
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }

        }

    }
}
