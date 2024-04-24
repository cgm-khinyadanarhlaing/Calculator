package com.example.calculator

import android.os.Bundle
import android.widget.Button
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
        var num1:Double
        var num2:Double
        var operator:String
        val tvDisplay: TextView = findViewById(R.id.tvDisplay)

        val button0:Button = findViewById(R.id.button0)
        val button1:Button = findViewById(R.id.button1)
        val button2:Button = findViewById(R.id.button2)
        val button3:Button = findViewById(R.id.button3)
        val button4:Button = findViewById(R.id.button4)
        val button5:Button = findViewById(R.id.button5)
        val button6:Button = findViewById(R.id.button6)
        val button7:Button = findViewById(R.id.button7)
        val button8:Button = findViewById(R.id.button8)
        val button9:Button = findViewById(R.id.button9)
        val clrBtn:Button = findViewById(R.id.clrBtn)
        val delBtn:Button = findViewById(R.id.delBtn)
        val addBtn:Button = findViewById(R.id.addBtn)
        val subBtn:Button = findViewById(R.id.subBtn)
        val mulBtn:Button = findViewById(R.id.mulBtn)
        val divBtn:Button = findViewById(R.id.divBtn)
        val resultBtn:Button = findViewById(R.id.resultBtn)
        val eqlBtn:Button = findViewById(R.id.eqlBtn)

        clrBtn.setOnClickListener {
            tvDisplay.clearComposingText();
            tvDisplay.text = "0"
        }
        button0.setOnClickListener {
            tvDisplay.text = "0"
        }
        button1.setOnClickListener {
            tvDisplay.text = "1"
        }
        button2.setOnClickListener {
            tvDisplay.text = "2"
        }
        button3.setOnClickListener {
            tvDisplay.text = "3"
        }
        button4.setOnClickListener {
            tvDisplay.text = "4"
        }
        button5.setOnClickListener {
            tvDisplay.text = "5"
        }
        button6.setOnClickListener {
            tvDisplay.text = "6"
        }
        button7.setOnClickListener {
            tvDisplay.text = "7"
        }
        button8.setOnClickListener {
            tvDisplay.text = "8"
        }
        button9.setOnClickListener {
            tvDisplay.text = "9"
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}