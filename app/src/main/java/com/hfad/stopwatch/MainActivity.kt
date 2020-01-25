package com.hfad.stopwatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var seconds = 0
    private var running = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        runTimer()
    }

    fun onClickStart(view: View) {
        running = true
    }

    fun onClickStop(view: View) {
        running = false
    }

    fun onClickReset(view: View) {
        running = false
        seconds = 0
    }

    val timeView: TextView = findViewById(R.id.time) as TextView

    fun runTimer() {

        var hours = seconds/3600
        var minutes = (seconds%3600)/60
        var seconds = seconds%60

        var time = String.format("%d:%02d:%02d", hours, minutes, seconds)
        timeView.setText(time)

            if(running){
                seconds++
            }
    }
}
