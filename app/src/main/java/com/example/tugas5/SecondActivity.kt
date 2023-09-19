package com.example.tugas5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugas5.MainActivity.Companion.EXTRA_EMAIL
import com.example.tugas5.MainActivity.Companion.EXTRA_NAME
import com.example.tugas5.MainActivity.Companion.EXTRA_PHONE
import com.example.tugas5.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val usernameSecond = intent.getStringExtra(EXTRA_NAME)
        val emailSecond = intent.getStringExtra(EXTRA_EMAIL)
        val phoneSecond = intent.getStringExtra(EXTRA_PHONE)
        with(binding){
            txtWelcome.text="Welcome $usernameSecond"
            txtYour1.text = "Your $emailSecond has been activated"
            txtYour2.text= "Your $phoneSecond has been registered"

            buttonLogout.setOnClickListener {
                finish();
            }
        }
    }
}