package com.example.w7_timepicker

import android.app.TimePickerDialog
import android.icu.text.SimpleDateFormat
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.TimePicker
import java.util.*
import java.util.Calendar.HOUR
import java.util.Calendar.MINUTE


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timePicker=findViewById<TimePicker>(R.id.timePicker)
        timePicker.setIs24HourView(true)
        val textView=findViewById<TextView>(R.id.textView)
        textView.text = "Время по умолчанию: 4:20"
        timePicker.setOnTimeChangedListener(
        {
                timePicker, hour, minute -> textView.text = "Время "+ hour + ":"+ minute
        })
       //timePicker.setOnTimeChangedListener { timePicker, i, i2 ->  }
        //(text.setText("Time:"+HOUR+":"+ MINUTE))

    }
}