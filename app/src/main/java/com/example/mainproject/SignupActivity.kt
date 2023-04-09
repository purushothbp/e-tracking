package com.example.mainproject

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mainproject.databinding.ActivityLoginBinding
import com.example.mainproject.databinding.ActivitySignupBinding
import com.google.firebase.auth.FirebaseAuth

class SignupActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySignupBinding
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySignupBinding.inflate(layoutInflater)
        firebaseAuth=FirebaseAuth.getInstance()
        val view=binding.root
        setContentView(view)

        binding.btSignUp.setOnClickListener{
            val Name=binding.etname.text.toString()
            val mobile=binding.etMobileNumber.text.toString()
            val college=binding.etCollegeName.text.toString()
            val email=binding.etEmail.text.toString()
            val radio=binding.RadioBt.toString()
            val password=binding.etCreatePassword.text.toString()
            val confirmPass=binding.etReEnterPassword.text.toString()
            if (Name.isNotEmpty() && mobile.isNotEmpty() && college.isNotEmpty() && email.isNotEmpty() && radio.isNotEmpty() && password.isNotEmpty() && confirmPass.isNotEmpty()){
                if (password == confirmPass) {
                    firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener{
                        if (it.isSuccessful){
                            val intent = Intent (this,ActivityLoginBinding::class.java)
                            startActivity(intent)
                        }else{
                            Toast.makeText(this,it.exception.toString(),Toast.LENGTH_SHORT).show()
                        }
                    }
                }else{
                    Toast.makeText(this,"Password Not Matching",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}