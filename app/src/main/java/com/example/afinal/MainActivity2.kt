package com.example.afinal

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_menu2.*
import kotlinx.android.synthetic.main.alert_tasarim.*
import kotlinx.android.synthetic.main.fragment_toast.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

val dosyayolu = "com.example.afinal"
var anahtarisim = "isimid"
var anahtarno = "numaraid"
var booleankey = "switchid"

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main2)
        var prefences = getSharedPreferences(dosyayolu, MODE_PRIVATE)
        var editor = prefences.edit()
        val savedBoolean = prefences.getBoolean(booleankey, false)
        var isim = prefences.getString(anahtarisim, null)
        var numara = prefences.getInt(anahtarno, 0)
        switchid.isChecked = savedBoolean
        isimid.setText(isim.toString())
//numaraid.setText(numara.toString().toInt())

//  numaraid.setText(enumValueOf<TextView>(numara.toString()) )











//        Toast.makeText(applicationContext,
//            "İsim : ${prefences.getString(anahtarisim, "Deger yok")}\n " +
//                    "Yaş : ${prefences.getInt(anahtarno, 0)}", Toast.LENGTH_LONG).show()

        button.setOnClickListener {
            var gelendeger = intent.getStringExtra("giden1")
            var gelendeger2 = intent.getStringExtra("giden2")

            if (isimid.text.toString().equals("") && numaraid.text.toString().equals("")) {
                val ad = AlertDialog.Builder(this)
                ad.setTitle("Hata")
                ad.setMessage("Alanlar boş bırakılamaz")
                ad.create().show()


            } else if (isimid.text.toString() == gelendeger && numaraid.text.toString() == gelendeger2) {
                editor.putString(anahtarisim, isimid.text.toString())
                editor.putInt(anahtarno, numaraid.text.toString().toInt())
                editor.putBoolean(booleankey, switchid.isChecked)
                editor.apply()

                Toast.makeText(this, "Kaydedildi", Toast.LENGTH_LONG).show()

                val tasarim = layoutInflater.inflate(R.layout.alert_tasarim, null)
                val ad = AlertDialog.Builder(this@MainActivity2)
                ad.setView(tasarim)
                ad.create().show()


                var gerisay = object : CountDownTimer(6000, 100) {

                    override fun onTick(p0: Long) {

                        sayac2.text = (p0 / 1000).toString()

                    }

                    override fun onFinish() {

                    }

                }
                gerisay.start()


            } else {
                val ad = AlertDialog.Builder(this)
                ad.setTitle("Hata")
                ad.setMessage("İsim veya Numara Bilgisi Yanlış")

                ad.setNegativeButton("Yeniden Dene") { dialogInterface, i ->
                    dialogInterface.cancel()

                }
                ad.setPositiveButton("ÇIK") { dialogInterface, i ->
                    val intent = Intent(Intent.ACTION_MAIN)
                    intent.addCategory(Intent.CATEGORY_HOME)
                    intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                    startActivity(intent)

                }
                ad.create().show()
            }

        }


    }

//    private fun savedata() {
//        val insertedtext = adsoyad.text.toString()
//        textView13.text = insertedtext
//        val sharedPreferences =
//            getSharedPreferences("Sharedprefes", Context.MODE_PRIVATE)
//        val editor = sharedPreferences.edit()
//        editor.apply() {
//            putString("STRING_KEY", insertedtext)
//
//        }.apply()
//        Toast.makeText(this@MainActivity2, "Data Saved", Toast.LENGTH_LONG).show()
//    }
//
//    private fun loaddata() {
//        val sharedPreferences = getSharedPreferences("Sharedprefes", Context.MODE_PRIVATE)
//        val savedString = sharedPreferences.getString("STRING_KEY", null)
//        val savedBoolean = sharedPreferences.getBoolean("BOOLEAN_KEY", false)
//        textView13.text=savedString
//        switchid.isChecked=savedBoolean
//    }


}