package com.doubleu.strange

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signInButton.setOnClickListener{
            redirectToLogin()
        }
    }

    private fun redirectToLogin(){
        val intent = Intent(this,LoginActivity::class.java).apply{}
        startActivity(intent)
    }
}
