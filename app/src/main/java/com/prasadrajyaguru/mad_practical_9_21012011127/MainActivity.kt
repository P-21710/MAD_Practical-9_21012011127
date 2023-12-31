package com.prasadrajyaguru.mad_practical_9_21012011127

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var alarmanimation : AnimationDrawable
    lateinit var heartanimation : AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val alarm : ImageView = findViewById(R.id.image_alarm)
        alarm.setBackgroundResource(R.drawable.alarm_animation_list)
        alarmanimation = alarm.background as AnimationDrawable

        val heart : ImageView = findViewById(R.id.image_heart)
        heart.setBackgroundResource(R.drawable.heart_animation_list)
        heartanimation = heart.background as AnimationDrawable
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {

        if (hasFocus) {
            alarmanimation.start()
            heartanimation.start()
        }
        else {
            alarmanimation.stop()
            heartanimation.stop()
        }
        super.onWindowFocusChanged(hasFocus)
    }
}