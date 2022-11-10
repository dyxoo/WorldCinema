package ru.dyxoo.worldcinema

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity: Activity( ){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
              val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}