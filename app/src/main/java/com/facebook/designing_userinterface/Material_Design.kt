package com.facebook.designing_userinterface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.facebook.designing_userinterface.databinding.ActivityMaterialDesignBinding
import com.google.android.material.snackbar.Snackbar

class Material_Design : AppCompatActivity() {
    private lateinit var binding: ActivityMaterialDesignBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMaterialDesignBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.saveButton.setOnClickListener {
// Show a Snackbar with the message "Saved details"
            showSnackbar("Saved details")

            // Clear the text in the EditText views
            binding.editTextName.text = null
            binding.editTextAddress.text = null
            binding.editTextPhone.text = null
            binding.editTextEmail.text = null
        }
        }

    private fun showSnackbar(message: String) {
        // Using the Material Design Snackbar
        val snackbar = Snackbar.make(
            binding.root,
            message,
            Snackbar.LENGTH_SHORT
        )
        // Optionally, you can customize the Snackbar further
        // For example, you can set an action with a listener
        snackbar.setAction("Dismiss") {
            // Handle action click if needed
            snackbar.dismiss()
        }
        // Show the Snackbar
        snackbar.show()
    }
}
