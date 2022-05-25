package com.example.afinal

import android.graphics.BitmapFactory
import android.os.Bundle
import android.provider.ContactsContract
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.afinal.R.id.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_renk.view.*
import kotlinx.android.synthetic.main.fragment_toast.*
import kotlinx.android.synthetic.main.ozel_toast.*

class ToastFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        val t = inflater.inflate(R.layout.fragment_toast, container, false)



        return t
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
var gelendeger=isimText.text.toString()
        button4.setOnClickListener {


            val tasarim = layoutInflater.inflate(R.layout.ozel_toast, null)
            val toastozel = Toast(context)
            toastozel.view = tasarim
            toastozel.duration = Toast.LENGTH_LONG
            toastozel.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.CENTER_VERTICAL, 0, 0)

            toastozel.show()
        }
     /*   radioButton.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {

            }
        }

        radioButton2.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {

            }
        }

        radioButton3.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {

            }
        }

        radioButton4.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {

            }

            super.onViewCreated(view, savedInstanceState)
        }
*/



    }
}