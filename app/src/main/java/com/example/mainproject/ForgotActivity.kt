package com.example.mainproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mainproject.databinding.ActivityForgotBinding
import com.example.mainproject.databinding.ActivityLoginBinding

class ForgotActivity : AppCompatActivity() {
    private lateinit var binding: ActivityForgotBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityForgotBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.tvGetOtp.setOnClickListener{
            val intent=Intent(this,OtpActivity::class.java)
            startActivity(intent)
            Toast.makeText(this,"Enter Otp",Toast.LENGTH_SHORT).show()
        }
    }
}