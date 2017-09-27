package com.imie.rolandgarros

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_menu.*

/**
 * Created by ElMou on 26/09/2017.
 */
class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        bt_back.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        bt_menu_creation.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, CreationActivity::class.java)
            startActivity(intent)
        }
    }
}
