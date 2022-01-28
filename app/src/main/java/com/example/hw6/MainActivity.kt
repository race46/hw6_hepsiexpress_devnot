package com.example.hw6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.library.baseAdapters.BR
import androidx.recyclerview.widget.GridLayoutManager
import com.example.hw6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = arrayListOf<Model>(
            Model("ayran","ayran","1.5"),
            Model("baklava","baklava","90"),
            Model("fanta","fanta","8"),
            Model("kadayif","kadayif","40"),
            Model("kofte","kofte","48"),
            Model("makarna","makarna","24"),
        )

        binding.recyclerView.layoutManager = GridLayoutManager(this,2)
        binding.recyclerView.adapter = MarketAdapter(list)

    }
}