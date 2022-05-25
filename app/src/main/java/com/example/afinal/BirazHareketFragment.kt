package com.example.afinal

import android.content.ClipData
import android.content.ClipDescription
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.ImageView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_biraz_hareket.*
import android.widget.Toast
import android.widget.RelativeLayout

import android.view.MotionEvent

import android.view.View.OnTouchListener
import androidx.constraintlayout.widget.ConstraintLayout


class BirazHareketFragment : Fragment() {
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

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_biraz_hareket, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        var listener = View.OnTouchListener(function = {view, motionEvent ->

            if (motionEvent.action == MotionEvent.ACTION_MOVE) {

                view.y = motionEvent.rawY - view.height/2
                view.x = motionEvent.rawX - view.width/2
            }
            else if(motionEvent.action== MotionEvent.ACTION_UP){
                Toast.makeText(context,"ImageView Yeni Konum",Toast.LENGTH_SHORT).show()

            }

            true

        })

        var listener2 = View.OnTouchListener(function = {view, motionEvent ->

            if (motionEvent.action == MotionEvent.ACTION_MOVE) {

                view.y = motionEvent.rawY - view.height/2
                view.x = motionEvent.rawX - view.width/2
            }
            else if(motionEvent.action== MotionEvent.ACTION_UP){
                Toast.makeText(context,"TextView Yeni Konum",Toast.LENGTH_SHORT).show()

            }

            true

        })
        var listener3 = View.OnTouchListener(function = {view, motionEvent ->

            if (motionEvent.action == MotionEvent.ACTION_MOVE) {

                view.y = motionEvent.rawY - view.height/2
                view.x = motionEvent.rawX - view.width/2
            }
            else if(motionEvent.action== MotionEvent.ACTION_UP){
                Toast.makeText(context,"Buton Yeni Konum",Toast.LENGTH_SHORT).show()

            }

            true

        })

        var listener4 = View.OnTouchListener(function = {view, motionEvent ->

            if (motionEvent.action == MotionEvent.ACTION_MOVE) {

                view.y = motionEvent.rawY - view.height/2
                view.x = motionEvent.rawX - view.width/2
            }
            else if(motionEvent.action== MotionEvent.ACTION_UP){
                Toast.makeText(context,"Edittext Yeni Konum",Toast.LENGTH_SHORT).show()

            }

            true

        })
        imageView4.setOnTouchListener(listener)
        textView11.setOnTouchListener(listener2)
        button3.setOnTouchListener(listener3)
        edittexthareket.setOnTouchListener(listener4)
    }
    }

