package com.example.assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plus.setOnClickListener{
            if(text1.text.equals(" ")|| text2.text.equals(" ")){
                Toast.makeText(applicationContext,"Enter numbers!!!",Toast.LENGTH_LONG).show()
            }

            else{
                var num1:Double = text1.text.toString().toDouble()
                var num2:Double = text2.text.toString().toDouble()
                var result:Double

                result = num1 + num2

                text4.text=result.toString()
            }
        }

        plus.setOnClickListener{
            if(text1.text.equals(" ")|| text2.text.equals(" ")){
                Toast.makeText(applicationContext,"Enter numbers!!!",Toast.LENGTH_LONG).show()
            }

            else{
                var num1:Double = text1.text.toString().toDouble()
                var num2:Double = text2.text.toString().toDouble()
                var result:Double

                result = num1 + num2

                text4.text=result.toString()
            }
        }

        minus.setOnClickListener{
            if(text1.text.equals(" ")|| text2.text.equals(" ")){
                Toast.makeText(applicationContext,"Enter numbers!!!",Toast.LENGTH_LONG).show()
            }

            else{
                var num1:Double = text1.text.toString().toDouble()
                var num2:Double = text2.text.toString().toDouble()
                var result:Double

                result = num1 - num2

                text4.text=result.toString()
            }
        }

        multiply.setOnClickListener{
            if(text1.text.equals(" ")|| text2.text.equals(" ")){
                Toast.makeText(applicationContext,"Enter numbers!!!",Toast.LENGTH_LONG).show()
            }

            else{
                var num1:Double = text1.text.toString().toDouble()
                var num2:Double = text2.text.toString().toDouble()
                var result:Double

                result = num1 * num2

                text4.text=result.toString()
            }
        }

        divided.setOnClickListener{
            if(text1.text.equals(" ")|| text2.text.equals(" ")){
                Toast.makeText(applicationContext,"Enter numbers!!!",Toast.LENGTH_LONG).show()
            }

            else{
                var num1:Double = text1.text.toString().toDouble()
                var num2:Double = text2.text.toString().toDouble()
                var result:Double

                result = num1 / num2

                text4.text=result.toString()
            }
        }

        clear.setOnClickListener{
            text1.setText("")
            text2.setText("")
            text4.setText("")
        }

    }
}
