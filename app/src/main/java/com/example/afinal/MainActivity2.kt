package com.example.afinal

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_menu2.*
import kotlinx.android.synthetic.main.alert_tasarim.*
import kotlinx.android.synthetic.main.fragment_toast.*




class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


 //numaraid.setText(numara.toString().toInt())
 //  numaraid.setText(enumValueOf<TextView>(numara.toString()) )






loadData()




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

                saveData()
            } else if (isimid.text.toString() == gelendeger && numaraid.text.toString() == gelendeger2) {


                val tasarim = layoutInflater.inflate(R.layout.alert_tasarim, null)
                val ad: android.app.AlertDialog.Builder = android.app.AlertDialog.Builder(this@MainActivity2)
             //   val ad = AlertDialog.Builder(this@MainActivity2)
                ad.setView(tasarim)
                ad.setMessage("3")
                val alert: android.app.AlertDialog = ad.create()
                alert.show()

                object : CountDownTimer(4000, 1000) {
                    override fun onTick(p0: Long) {
                        alert.setMessage((p0 / 1000).toString())


                    }

                    override fun onFinish() {
                        val intent = Intent(this@MainActivity2, MenuActivity2::class.java)
                        startActivity(intent)
                    }

                }.start()
//                ad.create().show()
//
//
////                var gerisay = object : CountDownTimer(6000, 100) {
////
////                    override fun onTick(p0: Long) {
////
////                        sayac2.text = (p0 / 1000).toString()
////
////                    }
////
////                    override fun onFinish() {
////
////                    }
////
////                }
////                gerisay.start()


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
    private fun saveData(){
        val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.apply{
            putString("STRING_KEY", adsoyad.toString())
            putString("INT_KEY", numara.toString())
            putBoolean("BOOLEAN_KEY", switchid.isChecked)

        }.apply()
        Toast.makeText(this, "başarılı", Toast.LENGTH_SHORT).show()
    }

    private fun loadData(){
        val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
        val savedString = sharedPreferences.getString("STRING_KEY", null)
        val savedInt = sharedPreferences.getString("INT_KEY", null)
        val savedboolean = sharedPreferences.getBoolean("BOOLEAN_KEY", false)

        isimid.setText(savedString)
            numaraid.setText(savedInt)
        switchid.isChecked = savedboolean
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