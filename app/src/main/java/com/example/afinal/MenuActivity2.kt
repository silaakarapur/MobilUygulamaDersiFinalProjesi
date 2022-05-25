package com.example.afinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.PopupMenu
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_menu2.*
import kotlinx.android.synthetic.main.fragment_renk.*

class MenuActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu2)
    }



    fun menu(view: View) {

            val acilirMenu = PopupMenu(this, button2)
            acilirMenu.menuInflater.inflate(R.menu.popupmenu, acilirMenu.menu)
            acilirMenu.setOnMenuItemClickListener { i->
                when(i.itemId){
                    R.id.anasayfa -> {
                        fragmentcagir(AnaSayfaFragment())
                        true
                    }

                    R.id.renkler -> {
fragmentcagir(RenkFragment())

                       true }



                    R.id.hareket -> {
                        fragmentcagir(BirazHareketFragment())
                        true}

                    R.id.gizlilik -> {
fragmentcagir(GorunurGorunmezFragment())
                        true}

                    R.id.toast -> {
fragmentcagir(ToastFragment())
                        true}
                    else -> false
                }
            }
            acilirMenu.show()

    }
    fun fragmentcagir(fragment: Fragment){
        var gecis= supportFragmentManager.beginTransaction()
        gecis.replace(R.id.fragmentContainerView,fragment)
        gecis.commit()
     }
}