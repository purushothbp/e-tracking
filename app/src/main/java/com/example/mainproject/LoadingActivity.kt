package com.example.mainproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.mainproject.databinding.ActivityLoadingBinding

class LoadingActivity : AppCompatActivity() {
    private  lateinit var binding:ActivityLoadingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoadingBinding.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)
        val appname=binding.LoadingView
        val lottie=binding.Lottie

        appname.animate().translationY(-1400f).setDuration(20000).setStartDelay(0);
        lottie.animate().translationY(2000f).setDuration(2000).setStartDelay(2500);


        Handler(Looper.getMainLooper()).postDelayed({
            val intent=Intent(this,HomeActivity::class.java)
            startActivity(intent)
            finish()
        },5000)

    }
}