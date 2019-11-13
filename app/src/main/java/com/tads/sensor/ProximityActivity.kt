package com.tads.sensor

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_proximity.*

class ProximityActivity : AppCompatActivity(), SensorEventListener {

    lateinit var sensorManager: SensorManager

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
    }

    override fun onSensorChanged(event: SensorEvent?) {
        sensorData.text = "PROXIMIDADE  = ${event!!.values[0]}"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proximity)

        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager

        sensorManager.registerListener(
            this,
            sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY),
            SensorManager.SENSOR_DELAY_NORMAL
        )
    }
}

