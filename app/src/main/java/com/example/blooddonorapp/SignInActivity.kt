package com.example.blooddonorapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out)
        setContentView(R.layout.activity_sign_in)
    }

    fun handleUserDetails(view: View) {
        startActivity(Intent(this, NewDetailsActivity::class.java))
    }
}
