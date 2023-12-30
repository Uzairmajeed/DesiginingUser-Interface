package com.facebook.designing_userinterface

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate

class Neumorphism_design : AppCompatActivity() {
    private lateinit var switcher: Switch
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_neumorphism_design)
        switcher = findViewById(R.id.your_switch_id) // Replace with your actual Switch ID
        switcher.setOnClickListener {
            // Toggle between night mode and not night mode
            if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            }
            // Recreate the activity to apply the changes
            recreate()
        }

    }
}



