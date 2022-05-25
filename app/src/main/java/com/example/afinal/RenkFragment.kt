package com.example.afinal

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.content.ContextCompat
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.fragment_renk.*


class RenkFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    val types = arrayOf("Renk Seçiniz","Sarımsı pembe", "İlkbahar yeşili","Lavanta Rengi ","Alizarin","Koyu Turkuaz")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val t=inflater.inflate(R.layout.fragment_renk, container, false)
        val spinner = t.findViewById<Spinner>(R.id.spinner)
        val spinner2=t.findViewById<Spinner>(R.id.spinner2)
        val spinner3=t.findViewById<Spinner>(R.id.spinner3)
        spinner?.adapter = activity?.applicationContext?.let { ArrayAdapter(it, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, types) } as SpinnerAdapter
        spinner2?.adapter=activity?.applicationContext?.let { ArrayAdapter(it, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, types) } as SpinnerAdapter
        spinner3?.adapter = activity?.applicationContext?.let { ArrayAdapter(it, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, types) } as SpinnerAdapter

        spinner?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                println("erreur")
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                textView8.text = "Sıla Karapür\n02180201050"

                val seciliIl = parent?.selectedItem.toString()

                when (seciliIl)
                {
                    "Renk Seçiniz"->{

                        textView8.visibility= View.INVISIBLE

                    }
                    "Sarımsı pembe" ->{
                        textView8.setTextColor(Color.parseColor("#FF8C69"))
                        textView8.visibility= View.VISIBLE

                }
                    "İlkbahar yeşili"->{
                        textView8.setTextColor(Color.parseColor("#00FF7F"))
                        textView8.visibility= View.VISIBLE

                    }
                    "Lavanta Rengi "->{
                        textView8.setTextColor(Color.parseColor("#B57EDC"))
                        textView8.visibility= View.VISIBLE

                    }
                    "Alizarin"->{
                        textView8.setTextColor(Color.parseColor("#E32636"))
                        textView8.visibility= View.VISIBLE

                    }
                    "Koyu Turkuaz"->{
                        textView8.setTextColor(Color.parseColor("#116062"))
                        textView8.visibility= View.VISIBLE

                    }

            }


        }

        }
        spinner2?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                println("erreur")
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                textView8.text = "Sıla Karapür"
                val seciliIl = parent?.selectedItem.toString()

                when (seciliIl)
                {
                    "Renk Seçiniz"->{

                        textView8.visibility= View.INVISIBLE

                    }
                    "Sarımsı pembe" ->{
                        textView8.setBackgroundColor(Color.parseColor("#FF8C69"))
                        textView8.visibility= View.VISIBLE

                    }
                    "İlkbahar yeşili"->{
                        textView8.setBackgroundColor(Color.parseColor("#00FF7F"))
                        textView8.visibility= View.VISIBLE

                    }
                    "Lavanta Rengi "->{
                        textView8.setBackgroundColor(Color.parseColor("#B57EDC"))
                        textView8.visibility= View.VISIBLE

                    }
                    "Alizarin"->{
                        textView8.setBackgroundColor(Color.parseColor("#E32636"))
                        textView8.visibility= View.VISIBLE

                    }
                    "Koyu Turkuaz"->{
                        textView8.setBackgroundColor(Color.parseColor("#116062"))
                        textView8.visibility= View.VISIBLE

                    }

                }
            }

        }
        spinner3?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                println("erreur")
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                textView8.text = "Sıla Karapür"
                textView8.isInvisible
                val seciliIl = parent?.selectedItem.toString()

                when (seciliIl)
                {
                    "Renk Seçiniz"->{

                        textView8.visibility= View.INVISIBLE

                    }
                    "Sarımsı pembe" ->{
                        fragmentrenk.setBackgroundColor(Color.parseColor("#FF8C69"))

                    }
                    "İlkbahar yeşili"->{
                        fragmentrenk.setBackgroundColor(Color.parseColor("#00FF7F"))

                    }
                    "Lavanta Rengi "->{
                        fragmentrenk.setBackgroundColor(Color.parseColor("#B57EDC"))

                    }
                    "Alizarin"->{
                        fragmentrenk.setBackgroundColor(Color.parseColor("#E32636"))

                    }
                    "Koyu Turkuaz"->{
                        fragmentrenk.setBackgroundColor(Color.parseColor("#116062"))

                    }

                }
            }

        }
        return t

    }


    companion object {

    }
}