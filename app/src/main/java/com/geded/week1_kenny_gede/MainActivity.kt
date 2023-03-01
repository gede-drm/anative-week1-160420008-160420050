package com.geded.week1_kenny_gede

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        btnToast.setOnClickListener{
            Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT).show()
        }
    }

}