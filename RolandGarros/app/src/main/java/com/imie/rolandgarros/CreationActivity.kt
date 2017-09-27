package com.imie.rolandgarros

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_creation.*
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by ElMou on 26/09/2017.
 */
class CreationActivity: AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_creation)

        bt_back_creation.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }

        bt_joueur_creation.setOnClickListener {
            val intent = Intent(this, CreationJoueurActivity::class.java)
            startActivity(intent)
        }

    }


}
