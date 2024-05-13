package com.example.bi_is_var

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bi_is_var.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var  binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        binding = ActivityMainBinding.inflate(layoutInflater)
        var giris = binding.root
        setContentView(giris)

        binding.giriskaydol.setOnClickListener{
            val kayitSayfasi = Intent(applicationContext,MainKayitOl::class.java)
            startActivity(kayitSayfasi)
        }

    }
}