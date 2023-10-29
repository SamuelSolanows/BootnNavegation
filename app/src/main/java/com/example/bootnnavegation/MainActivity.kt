package com.example.bootnnavegation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RestrictTo.Scope
import androidx.fragment.app.Fragment
import com.example.bootnnavegation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            btnav.menu.findItem(R.id.item1).setOnMenuItemClickListener {
                pasarfragment(fragment1())
                return@setOnMenuItemClickListener false
            }
            btnav.menu.findItem(R.id.item2).setOnMenuItemClickListener {
               pasarfragment(fragment2())
                return@setOnMenuItemClickListener false
            }
            btnav.menu.findItem(R.id.item3).setOnMenuItemClickListener {
                pasarfragment(fragment3())
                return@setOnMenuItemClickListener false
            }
        }

    }
    fun pasarfragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView,fragment).commit()
    }
}