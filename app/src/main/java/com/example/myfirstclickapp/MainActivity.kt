package com.example.myfirstclickapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var textView: EditText
    lateinit var buttonClickMe: Button
    lateinit var textViewMessage: TextView

    //class textViews : View(0)

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)


            textView = findViewById(R.id.TextViews)
            buttonClickMe = findViewById<Button>(R.id.btn1)
            buttonClickMe = findViewById<Button>(R.id.btn2)
            textViewMessage = findViewById(R.id.TextViews)


            buttonClickMe.setOnClickListener(this)


        }

    override fun onClick(v: View?) {
       val name = textView.text
        textViewMessage.text = "0 ++"
    }


}


