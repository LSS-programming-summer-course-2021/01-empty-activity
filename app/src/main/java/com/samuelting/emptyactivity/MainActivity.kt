package com.samuelting.emptyactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v("Test", "Hello Samuel! verbose")
        Log.d("Test", "Hello Samuel! debug")
        Log.e("Test", "Hello Samuel! error")
    }
}