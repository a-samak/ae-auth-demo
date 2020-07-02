package com.example.authdemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val appLinkIntent = intent
        val appLinkData = appLinkIntent.data
        textView.text = appLinkData?.path
    }

    fun onClick(view: View) {
        this.finish()
    }
}