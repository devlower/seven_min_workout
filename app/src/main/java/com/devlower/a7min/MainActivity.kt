package com.devlower.a7min

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.FrameLayout
import android.widget.Toast
import com.devlower.a7min.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setContentView(R.layout.activity_main)

        binding?.flStart?.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                view.setBackgroundResource(R.drawable.ic_btn_taped)
                return@setOnTouchListener true
            }
            view.setBackgroundResource(R.drawable.ic_init_btn)
            false
        }
    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}