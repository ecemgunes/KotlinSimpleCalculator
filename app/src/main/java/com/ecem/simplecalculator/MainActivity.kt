package com.ecem.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import  com.ecem.simplecalculator.R

import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    lateinit var myString : String

    var number1 : Int? = null
    var number2 : Int? = null
    var result : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myString = ""

    }

    fun MySum (view: View) {
        val number1 =editText.text.toString().toIntOrNull()
       val  number2 = editText2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null ) {

            ResultText.text = "Error!"

        } else {
           val result = number1!! + number2!!
            ResultText.text = "Result: $result"
        }

    }
    fun MySub (view: View) {
        number1 = editText.text.toString().toIntOrNull()
        number2 = editText2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null ) {

            ResultText.text = "Error!"

        } else {
            result = number1!! - number2!!
            ResultText.text = "Result: $result"
        }


    }
    fun MyMult (view: View) {
        number1 = editText.text.toString().toIntOrNull()
        number2 = editText2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null ) {

            ResultText.text = "Error!"

        } else {
            result = number1!! * number2!!
            ResultText.text = "Result: $result"
        }



    }
    fun MyDiv (view: View) {
        number1 = editText.text.toString().toIntOrNull()
        number2 = editText2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null ) {

            ResultText.text = "Error!"

        } else {
            result = number1!! / number2!!
            ResultText.text = "Result: $result"
        }


    }
}