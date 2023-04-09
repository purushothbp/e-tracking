package com.example.mainproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mainproject.databinding.ActivityOtpBinding

class OtpActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOtpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityOtpBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btSubmit.setOnClickListener{
            val intent = Intent(this,NewPasswordActivity::class.java)
            startActivity(intent)
            Toast.makeText(this,"Create new Password",Toast.LENGTH_LONG).show()
        }
    }
}