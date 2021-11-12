package com.example.criminalintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.criminalintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        val layout = binding.root
        setContentView(layout)

    }
}