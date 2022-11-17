package com.jt17.sharedpreference

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pref = Prefs(this)
        findViewById<Button>(R.id.put_btn).setOnClickListener {
            val getEditText = findViewById<EditText>(R.id.editText).text.toString()
            pref.setName(getEditText)

        }
        findViewById<Button>(R.id.show_btn).setOnClickListener {
            findViewById<TextView>(R.id.result_text).text = pref.getName()

        }

    }
}