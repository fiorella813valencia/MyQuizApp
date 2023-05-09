package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myquizapp.databinding.ActivityQuestionBinding
import com.example.myquizapp.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        val view3 =binding.root
        setContentView(view3)
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN

        val userName=intent.getStringExtra(setData.name)
        val userScore=intent.getStringExtra(setData.score)
        val totalQuestion=intent.getStringExtra("total size")

        binding.congratullations.text="Congratulations ${userName}!!"
        binding.Score.text="${userScore}/${totalQuestion}"

        binding.button.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}