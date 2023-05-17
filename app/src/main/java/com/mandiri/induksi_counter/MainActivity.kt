package com.mandiri.induksi_counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll = findViewById<Button>(R.id.btn_roll)
        val tvResult = findViewById<TextView>(R.id.tv_dice_result)

        btnRoll.setOnClickListener(){
            var result = (1..6).random()
            tvResult.setText(result.toString())
        }
    }
}