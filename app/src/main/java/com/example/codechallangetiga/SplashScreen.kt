package com.example.codechallangetiga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.example.codechallangetiga.databinding.ActivitySplashScreenBinding

class SplashScreen : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding
    private val SPLASH_TIME: Long = 6000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivitySplashScreenBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setupAnimation()

        Handler().postDelayed({
            startActivity(Intent(this,OnBoardingActivity::class.java))
            finish()
        }, SPLASH_TIME)
    }
    private fun setupAnimation(){
        val animeFadeIn: Animation = AnimationUtils.loadAnimation(applicationContext, R.anim.fade_in_anim)

        binding.splashImageOne.startAnimation(animeFadeIn)
        binding.splashImageTwo.startAnimation(animeFadeIn)
    }
}