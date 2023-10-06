package com.prasadrajyaguru.mad_practical_9_21012011127

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SplashActivity : AppCompatActivity() {

    lateinit var logoimage : ImageView
    lateinit var logoanimation : Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        logoimage=findViewById<ImageView>(R.id.logo)

        logoanimation=AnimationUtils.loadAnimation(this,R.anim.twin_animation)
        logoanimation.setAnimationListener(this)
    }
},
        animation.animationlistener