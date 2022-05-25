package com.example.afinal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.fragment_gorunur_gorunmez.*


class GorunurGorunmezFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        return inflater.inflate(R.layout.fragment_gorunur_gorunmez, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        button1.setOnClickListener {


         if (button2.visibility==View.VISIBLE){
             button2.visibility=View.INVISIBLE
         }else{
             button2.visibility=View.VISIBLE
         }

        }
        button2.setOnClickListener {


            if (button1.visibility==View.VISIBLE){
                button1.visibility=View.INVISIBLE
            }else{
                button1.visibility=View.VISIBLE
            }

        }
        textView1.setOnClickListener {


            if (textView2.visibility==View.VISIBLE){
                textView2.visibility=View.INVISIBLE
            }else{
                textView2.visibility=View.VISIBLE
            }

        }
        textView2.setOnClickListener {


            if (textView1.visibility==View.VISIBLE){
                textView1.visibility=View.INVISIBLE
            }else{
                textView1.visibility=View.VISIBLE
            }

        }
        radioButton1.setOnClickListener {


            if (radioButton2.visibility==View.VISIBLE){
                radioButton2.visibility=View.INVISIBLE
            }else{
                radioButton2.visibility=View.VISIBLE
            }

        }
        radioButton2.setOnClickListener {


            if (radioButton1.visibility==View.VISIBLE){
                radioButton1.visibility=View.INVISIBLE
            }else{
                radioButton1.visibility=View.VISIBLE
            }

        }
        checkBox.setOnClickListener {


            if (checkBox2.visibility==View.VISIBLE){
                checkBox2.visibility=View.INVISIBLE
            }else{
                checkBox2.visibility=View.VISIBLE
            }

        }
        checkBox2.setOnClickListener {


            if (checkBox.visibility==View.VISIBLE){
                checkBox.visibility=View.INVISIBLE
            }else{
                checkBox.visibility=View.VISIBLE
            }

        }

        super.onViewCreated(view, savedInstanceState)
    }



}