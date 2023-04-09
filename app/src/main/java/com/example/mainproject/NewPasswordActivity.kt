package com.example.mainproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mainproject.databinding.ActivityNewPasswordBinding

class NewPasswordActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNewPasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityNewPasswordBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        binding.btSubmit.setOnClickListener{
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
            Toast.makeText(this,"New passsword created",Toast.LENGTH_SHORT).show()
            Toast.makeText(this,"Login to TRACK",Toast.LENGTH_SHORT).show()
        }
    }
}