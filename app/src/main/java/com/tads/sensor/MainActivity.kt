package com.tads.sensor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        acBtn.setOnClickListener {
            startActivity(Intent(this, AccelerometerActivity::class.java))
        }

        gyBtn.setOnClickListener {
            startActivity(Intent(this, GyroscopeActivity::class.java))
        }

        prBtn.setOnClickListener {
            startActivity(Intent(this, ProximityActivity::class.java))
        }
    }
}
