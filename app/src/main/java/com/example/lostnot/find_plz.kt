package com.example.myapplication

import android.content.Context
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.RequiresApi

class find_plz : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_plz)

        val count = 5

        val mEmailLinear = findViewById<LinearLayout>(R.id.parentLayout)
        val inflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        for (i in 0 until count) {
            val custom = inflater.inflate(R.layout.find_custom_layout, null)

            val titleTextView = custom.findViewById<TextView>(R.id.parentTitle)
            val explanTextView = custom.findViewById<TextView>(R.id.parentExplan)

            titleTextView.text = "가방을 잃어버렸어요"
            explanTextView.text = "가방을 잃어버렸어요"

            mEmailLinear.addView(custom)
        }
    }
}
