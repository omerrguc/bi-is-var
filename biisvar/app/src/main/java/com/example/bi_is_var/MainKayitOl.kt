package com.example.bi_is_var

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bi_is_var.databinding.ActivityMainBinding
import com.example.bi_is_var.databinding.ActivityMainKayitOlBinding

class MainKayitOl : AppCompatActivity() {

    lateinit var binding: ActivityMainKayitOlBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainKayitOlBinding.inflate(layoutInflater)
        val kayitSayfasi= binding.root
        setContentView(kayitSayfasi)

        binding.kayitGiriseDon.setOnClickListener{
            val girisSayfasi = Intent(applicationContext,MainActivity::class.java)
            startActivity(girisSayfasi)
        }
    }
}