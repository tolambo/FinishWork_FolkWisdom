package com.example.finishwork_folkwisdom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.finishwork_folkwisdom.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvStatements.setOnClickListener {
            binding.tvStatements.text = getStatements()
        }
    }
    private fun getStatements(): String{
        return resources.getStringArray(R.array.statements)[randomNumder()]
    }
    private fun randomNumder(): Int{
        val size = resources.getStringArray(R.array.statements).size - 1
        return (0..size).random()
    }
}