package com.tads.sensor

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_acelerometer.*

class AcelerometerActivity : AppCompatActivity(), SensorEventListener {

    lateinit var sensorManager: SensorManager

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onSensorChanged(event: SensorEvent?) {
        sensorData.text = "ACELEROMETRO \n\n X = ${event!!.values[0]}\n\n Y = ${event?.values[1]} \n\n Z = ${event?.values?.get(2)}"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acelerometer)

        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager

        sensorManager.registerListener(
            this,
            sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
            SensorManager.SENSOR_DELAY_NORMAL
        )
    }
}
