package com.example.activityanimationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

// this is my first activity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // all file in github you can download after that all file add in android studio
        
        
        // all button setOnClickListener
        // after that overridePendingTransition this method call
        // and add animation parameter
        findViewById<Button>(R.id.cardBtn).setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            this@MainActivity.overridePendingTransition(
                R.anim.animate_card_enter,
                R.anim.animate_card_exit
            )
        }
        findViewById<Button>(R.id.diagonalBtn).setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            this@MainActivity.overridePendingTransition(
                R.anim.animate_diagonal_right_enter,
                R.anim.animate_diagonal_right_exit
            )
        }
        findViewById<Button>(R.id.fadeBtn).setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            this@MainActivity.overridePendingTransition(
                R.anim.animate_fade_enter,
                R.anim.animate_fade_exit
            )
        }
        findViewById<Button>(R.id.inAndOutBtn).setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            this@MainActivity.overridePendingTransition(
                R.anim.animate_in_out_enter,
                R.anim.animate_in_out_exit
            )
        }
        findViewById<Button>(R.id.shrinkBtn).setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            this@MainActivity.overridePendingTransition(
                R.anim.animate_shrink_enter,
                R.anim.animate_shrink_exit
            )
        }
        findViewById<Button>(R.id.slideDownBtn).setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            this@MainActivity.overridePendingTransition(
                R.anim.animate_slide_down_enter,
                R.anim.animate_slide_down_exit
            )
        }
        findViewById<Button>(R.id.slideLeftBtn).setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            this@MainActivity.overridePendingTransition(
                R.anim.animate_slide_left_enter,
                R.anim.animate_slide_left_exit
            )
        }
        findViewById<Button>(R.id.slideRightBtn).setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            this@MainActivity.overridePendingTransition(
                R.anim.animate_slide_in_left,
                R.anim.animate_slide_out_right
            )
        }
        findViewById<Button>(R.id.slideUpBtn).setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            this@MainActivity.overridePendingTransition(
                R.anim.animate_slide_up_enter,
                R.anim.animate_slide_up_exit
            )
        }
        findViewById<Button>(R.id.spinBtn).setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            this@MainActivity.overridePendingTransition(
                R.anim.animate_spin_enter,
                R.anim.animate_spin_exit
            )
        }
        findViewById<Button>(R.id.splitBtn).setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            this@MainActivity.overridePendingTransition(
                R.anim.animate_split_enter,
                R.anim.animate_split_exit
            )
        }
        findViewById<Button>(R.id.swipeLeftBtn).setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            this@MainActivity.overridePendingTransition(
                R.anim.animate_swipe_left_enter,
                R.anim.animate_swipe_left_exit
            )
        }
        findViewById<Button>(R.id.swipeRightBtn).setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            this@MainActivity.overridePendingTransition(
                R.anim.animate_swipe_right_enter,
                R.anim.animate_swipe_right_exit
            )
        }
        findViewById<Button>(R.id.windmillBtn).setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            this@MainActivity.overridePendingTransition(
                R.anim.animate_windmill_enter,
                R.anim.animate_windmill_exit
            )
        }
        findViewById<Button>(R.id.zoomBtn).setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            this@MainActivity.overridePendingTransition(
                R.anim.animate_zoom_enter,
                R.anim.animate_zoom_exit
            )
        }
    }
}