package com.example.androidmaster.imcalculator

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.androidmaster.R
import com.example.androidmaster.databinding.ActivityResultImcactivityBinding
import com.example.androidmaster.imcalculator.ImcCalculatorActivity.Companion.IMC_KEY

class ResultIMCActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultImcactivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result_imcactivity)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding = ActivityResultImcactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val result = intent.extras?.getDouble(IMC_KEY) ?: -1.0
        initListeners()
        initUI(result)
    }

    private fun initListeners() {
        binding.btnRecalculate.setOnClickListener {
            onBackPressed()
        }
    }

    private fun initUI(result: Double) {
        binding.tvIMC.text = result.toString()

        when(result) {
            in 0.0..18.50 -> { //bajo peso
                binding.tvResult.setTextColor(ContextCompat.getColor(this, R.color.peso_bajo))
                binding.tvResult.text = getString(R.string.title_bajo_peso)
                binding.tvDescription.text = getString(R.string.description_bajo_peso)
            }
            in 18.51.. 24.99 -> { //peso normal
                binding.tvResult.setTextColor(ContextCompat.getColor(this, R.color.peso_normal))
                binding.tvResult.text = getString(R.string.title_peso_normal)
                binding.tvDescription.text = getString(R.string.description_peso_normal)
            }
            in 25.00..29.99 -> { //sobrepeso
                binding.tvResult.setTextColor(ContextCompat.getColor(this, R.color.peso_sobrepeso))
                binding.tvResult.text = getString(R.string.title_sobrepeso)
                binding.tvDescription.text = getString(R.string.description_sobrepeso)
            }
            in 30.00..99.00 -> {
                binding.tvResult.setTextColor(ContextCompat.getColor(this, R.color.obesidad))
                binding.tvResult.text = getString(R.string.title_obesidad)
                binding.tvDescription.text = getString(R.string.title_obesidad)
            }
            else -> { //error
                binding.tvIMC.text = getString(R.string.error)
                binding.tvResult.text = "Error"
                binding.tvDescription.text = "Error"
                binding.tvResult.setTextColor(ContextCompat.getColor(this, R.color.obesidad))
            }
        }
    }


}