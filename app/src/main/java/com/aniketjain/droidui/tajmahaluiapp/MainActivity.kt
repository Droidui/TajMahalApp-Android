package com.aniketjain.droidui.tajmahaluiapp

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.aniketjain.droidui.tajmahaluiapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // binding set up
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Hide status bar
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        // Show status bar
        window.clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)


    }
}