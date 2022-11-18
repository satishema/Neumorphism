package com.android.neumorphism

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.neumorphism.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textview.setOnClickListener {
            binding.textview.text = listOf("Neumorphism", "in", "Android").random()
        }

        binding.button.setOnClickListener {
            startActivity(Intent(this, ColorSampleActivity::class.java))
        }

        binding.flatCard.setOnClickListener {
            startActivity(Intent(this, CardSampleActivity::class.java))
        }

        binding.fab.setOnClickListener {
            startActivity(Intent(this, ListSampleActivity::class.java))
        }

        binding.pressedCard.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
        }
    }
}