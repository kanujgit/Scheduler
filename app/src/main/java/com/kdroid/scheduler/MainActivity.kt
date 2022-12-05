package com.kdroid.scheduler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kdroid.common.extensions.viewBindings
import com.kdroid.scheduler.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val binding by viewBindings(ActivityMainBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}