package com.example.blooddonorapp

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextThemeWrapper
import android.view.View
import androidx.appcompat.app.AlertDialog
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_new_details.*


class NewDetailsActivity : AppCompatActivity() {

    lateinit var bloodGroupDialog: AlertDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out)
        setContentView(R.layout.activity_new_details)
        val bloodGroupDialogBuilder = AlertDialog.Builder(ContextThemeWrapper(this, R.style.BloodGroupDialogStyle))
        bloodGroupDialogBuilder.setTitle("Select your Blood Group")
        bloodGroupDialogBuilder.setItems(Constants.bloodGroupList
        ) { dialog, item ->
            bloodGroupButton.text = Constants.bloodGroupList[item]
        }
        bloodGroupDialogBuilder.setCancelable(false)
        bloodGroupDialog = bloodGroupDialogBuilder.create()
    }

    fun showBloodGroupOptions(view: View) {
        bloodGroupDialog.show()
    }
}
