package com.example.afinal

import android.content.Context
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_denemeactivity.*
import kotlinx.android.synthetic.main.activity_main2.*

class denemeactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_denemeactivity)
        button7.setOnClickListener {
            val builder: android.app.AlertDialog.Builder = android.app.AlertDialog.Builder(this@denemeactivity)
            builder.setTitle("Time left")
            builder.setMessage("start time")
            builder.setPositiveButton("OK",
                DialogInterface.OnClickListener { dialogInterface, i -> dialogInterface.cancel() })

            val alert: android.app.AlertDialog? = builder.create()
            alert?.show()
            object : CountDownTimer(10000, 1000) {
                override fun onTick(l: Long) {
                    alert?.setMessage("left: $l")

                }

                override fun onFinish() {
                    alert?.setMessage("end")
                }

            }.start()
        }

        loadData()
        kaydet.setOnClickListener {
            saveData()
        }
    }

    private fun saveData(){
        val insertedText = deneme1.text.toString()
        denemetextview.text = insertedText

        val insertedText2 = deneme3.text.toString()
        denemetextview.text = insertedText2

        val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.apply{
            putString("STRING_KEY", insertedText)
            putString("INT_KEY", insertedText2)
            putBoolean("BOOLEAN_KEY", switch2.isChecked)

        }.apply()
        Toast.makeText(this, "başarılı", Toast.LENGTH_SHORT).show()
    }

    private fun loadData(){
        val sharedPreferences = getSharedPreferences("sharedPrefs",Context.MODE_PRIVATE)
        val savedString = sharedPreferences.getString("STRING_KEY", null)
        val savedInt = sharedPreferences.getString("INT_KEY", null)
        val savedboolean = sharedPreferences.getBoolean("BOOLEAN_KEY", false)

        deneme1.setText(savedString)
        deneme3.setText(savedInt)
        switch2.isChecked = savedboolean
    }

}