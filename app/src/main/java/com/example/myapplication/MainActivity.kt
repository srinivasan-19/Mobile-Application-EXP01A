package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.provider.CalendarContract
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val main : LinearLayout = findViewById(R.id.main)
        val textView : TextView=findViewById(R.id.textView)
        val changesize : Button = findViewById(R.id.changesize)
        val changecolor : Button = findViewById(R.id.changecolor)
        val changebgcolor : Button = findViewById(R.id.changebgcolor)
        var size=50f


        changesize.setOnClickListener {
            textView.textSize= size
            size=size+5
        }
        var count1 = 0
        changecolor.setOnClickListener {
            when(count1%6)
            {
                0 -> textView.setTextColor(Color.BLUE)
                1 -> textView.setTextColor(Color.RED)
                2 -> textView.setTextColor(Color.GREEN)
                3 -> textView.setTextColor(Color.MAGENTA)
                4 -> textView.setTextColor(Color.YELLOW)
                5 -> textView.setTextColor(Color.BLACK)



            }
            count1++
        }
        var count2 = 0
        changebgcolor.setOnClickListener {
            when(count2%3)
            {
                0 -> main.setBackgroundColor(Color.LTGRAY)
                1 -> main.setBackgroundColor(Color.RED)
                2 -> main.setBackgroundColor(Color.CYAN)
            }
            count2++
        }




        }
    }
