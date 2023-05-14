package com.example.activityanimationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        // here onBack pressed method deprecated so, how can solve this problem
        // top right corner onBackPressed deprecated problem solve



        // here any animation code add
        // here you can change animation activity
        this@SecondActivity.overridePendingTransition(
            R.anim.animate_fade_enter,
            R.anim.animate_fade_exit
        )
    }
}