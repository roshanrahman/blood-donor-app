package com.example.blooddonorapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class NewUserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out)
        setContentView(R.layout.activity_new_user)
    }

    fun continueAsDonor(view: View) {
        val intentAsDonor = Intent(this, SignInActivity::class.java)
        intentAsDonor.putExtra("accountType", Constants.AccountType.DONOR)
        startActivity(intentAsDonor)
    }

    fun continueAsRecipient(view: View) {
        val intentAsDonor = Intent(this, SignInActivity::class.java)
        intentAsDonor.putExtra("accountType", Constants.AccountType.RECIPIENT)
        startActivity(intentAsDonor)
    }
}
