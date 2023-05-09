package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import android.widget.Toast
import com.example.myquizapp.databinding.ActivityMainBinding

//import kotlinx.android.synthetic.main.activity_main.

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)

        showthem()

    }

    fun showthem(){
        binding.button.setOnClickListener{
            if(binding.input.text.toString().isEmpty()){
                Toast.makeText(this,"Enter your name",Toast.LENGTH_SHORT).show()
            }
            else
            {
                var intent=Intent(this,QuestionActivity::class.java)
                intent.putExtra("${setData.name}",binding.input.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}