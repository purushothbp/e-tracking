package com.example.mainproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mainproject.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding:ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityHomeBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        binding.BusRoute.setOnClickListener {}
    }
}