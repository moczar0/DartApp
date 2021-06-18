package com.example.pksdarts



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pksdarts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_menu)
        binding = ActivityMainBinding.inflate(layoutInflater)

    }





}