package com.example.currency_check

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun mytoast (view: View)
    {
        val mytoast = Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT)
        mytoast.show()
    }
    fun countMe (view: View)
    {
        val string = textView.text.toString()
        var count: Int = string.toInt()
        count++
        textView.text = count.toString()

    }
    fun randomMe(view: View)
    {
        val randomIntent = Intent(this, SecondActivity::class.java)
        startActivity(randomIntent)
    }
}
