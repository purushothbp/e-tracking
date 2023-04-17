package com.example.mainproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Button
import com.example.mainproject.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {
    private lateinit var binding:ActivityLoginBinding
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        firebaseAuth=FirebaseAuth.getInstance()
        binding.btSignin.setOnClickListener{
            val email=binding.etemail.text.toString()
            val password=binding.etPassword.text.toString()
            if(email.isNotEmpty() && password.isNotEmpty()){
                firebaseAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener{
                    if(it.isSuccessful){
                        val intent=Intent(this,MapsActivity::class.java)
                        Toast.makeText(this,"Successfully Logged in",Toast.LENGTH_SHORT).show()
                        startActivity(intent)
                    }else{
                        Toast.makeText(this,it.exception.toString(),Toast.LENGTH_SHORT).show()
                    }
                }
            }
            else{
                Toast.makeText(this,"Empty Fields Are not Allowed !!",Toast.LENGTH_SHORT).show()
            }
        }
        val view=binding.root
        setContentView(view)
        binding.tvSignUp.setOnClickListener{
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
            Toast.makeText(this,"Fill the required DETAILS",Toast.LENGTH_LONG).show()
        }

    }

    override fun onStart() {
        super.onStart()
        if(firebaseAuth.currentUser != null){
            val intent=Intent(this,MapsActivity::class.java)
            startActivity(intent)
        }
    }
}


