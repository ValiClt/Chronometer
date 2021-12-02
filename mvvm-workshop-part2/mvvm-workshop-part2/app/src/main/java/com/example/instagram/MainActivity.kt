package com.example.instagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.widget.Chronometer
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.instagram.databinding.ActivityMainBinding
//import android.support.v4.app.AppCompatActivity
class MainActivity : AppCompatActivity() {

    private lateinit var Playbutton: ImageView
    private lateinit var Chronometer: Chronometer
    var isPlay = false
    var pauseOffSet = 0
    private val mainViewModel: MainViewModel by viewModels()

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.lifecycleOwner = this
        binding.mainViewModel = mainViewModel

      //  mainViewModel.getUserPost()




        }}




