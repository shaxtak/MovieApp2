package com.example.movieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.movieapp.adapter.Adapter
import com.example.movieapp.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {
    val binding by lazy {ActivityMain4Binding.inflate(layoutInflater)}
    lateinit var adapter: Adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}