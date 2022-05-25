package com.example.afinal

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var gerisay = object : CountDownTimer(6000, 100) {

            override fun onTick(p0: Long) {
                sayac.text = (p0 / 1000).toString()
            }

            override fun onFinish() {
                sayac.text = "0"
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                intent.putExtra("giden1", adsoyad.text.toString())
                intent.putExtra("giden2", numara.text.toString())

                startActivity(intent)
            }
        }
        gerisay.start()
        val anim: Animation = AlphaAnimation(0.0f, 1.0f)
        anim.duration = 200 //You can manage the time of the blink with this parameter
        anim.startOffset = 20
        anim.repeatMode = Animation.REVERSE
        anim.repeatCount = Animation.INFINITE
        adsoyad.startAnimation(anim)


    }

}