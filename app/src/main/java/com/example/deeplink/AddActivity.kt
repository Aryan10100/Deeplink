package com.example.deeplink

import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.deeplink.databinding.ActivityAddBinding

class AddActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAddBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculate.setOnClickListener {
            val firstNoStr = binding.firstNumber.text.toString()
            val secondNoStr = binding.secondNumber.text.toString()

            // Check if the input fields are empty
            if (firstNoStr.isEmpty() || secondNoStr.isEmpty()) {
                Toast.makeText(this, "Please enter both numbers", Toast.LENGTH_SHORT).show()
            } else {
                try {
                    // Convert input strings to integers
                    val firstNo = firstNoStr.toInt()
                    val secondNo = secondNoStr.toInt()

                    // Perform subtraction
                    val result = firstNo + secondNo

                    // Display result
                    binding.tvResult.text = "$result"
                } catch (e: NumberFormatException) {

                    Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }


}


