package com.example.instagram

import android.os.SystemClock
import android.view.View
import android.widget.Chronometer
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.business.model.UserPost

class MainViewModel : ViewModel() {

    val userPostLiveData = MutableLiveData<UserPost>()
    val name = MutableLiveData("")
    lateinit var chronometer: Chronometer
    fun startTimer(chronometer: Chronometer){
    chronometer.base=SystemClock.elapsedRealtime()
        chronometer.start()


    }

    fun stopTimer(chronometer: Chronometer){
        chronometer.base=SystemClock.elapsedRealtime()
        chronometer.stop()


    }


}


fun Any.setImageResource(image1Background: Int) {

}
