package com.example.androidmaster

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.androidmaster.databinding.ActivityMenuBinding
import com.example.androidmaster.firstapp.FirstAppActivity
import com.example.androidmaster.firstapp.ResultActivity
import com.example.androidmaster.imcalculator.ImcCalculatorActivity
import com.example.androidmaster.settings.SettingsActivity
import com.example.androidmaster.superheroapp.SuperHeroListActivity
import com.example.androidmaster.todoapp.TodoActivity

class MenuActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSaludApp.setOnClickListener { navigateToSaludApp() }
        binding.btnIMCApp.setOnClickListener { navigateToImcApp() }
        binding.btnTODO.setOnClickListener { navigateToTODOApp() }
        binding.btnSuperhero.setOnClickListener { navigateToSuperheroApp() }
        binding.btnSettings.setOnClickListener { navigateToSettingsApp() }
    }

    private fun navigateToSettingsApp() {
        val intent = Intent(this,SettingsActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToTODOApp() {
        val intent = Intent(this, TodoActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToImcApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludApp() {
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSuperheroApp(){
        val intent = Intent(this, SuperHeroListActivity::class.java)
        startActivity(intent)
    }
}