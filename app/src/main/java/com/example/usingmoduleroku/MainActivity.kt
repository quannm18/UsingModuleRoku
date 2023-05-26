package com.example.usingmoduleroku

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.usingmoduleroku.databinding.ActivityMainBinding
import kotlinx.coroutines.launch
import wseemann.media.romote.tasks.AvailableDevicesTask

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val availableDevicesTask: AvailableDevicesTask = AvailableDevicesTask(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button.setOnClickListener {
            lifecycleScope.launch {
                Log.e("TAG::", "onCreate: ${availableDevicesTask.call()}")
            }
        }
    }
}