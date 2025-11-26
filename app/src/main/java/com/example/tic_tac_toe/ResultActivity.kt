package com.example.tic_tac_toe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val result = intent.getStringExtra("RESULT") ?: "결과"
        val message = intent.getStringExtra("MESSAGE") ?: ""

        findViewById<TextView>(R.id.resultTitle).text = result
        findViewById<TextView>(R.id.resultMessage).text = message

        findViewById<Button>(R.id.playAgainButton).setOnClickListener {
            val intent = Intent(this, GameActivity::class.java)
            startActivity(intent)
            finish()
        }

        findViewById<Button>(R.id.mainMenuButton).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}