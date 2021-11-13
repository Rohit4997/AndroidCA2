package com.rohit.setafirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class SecondQuestion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_question)


        lateinit var radioButton: RadioButton
        val radioGroup= findViewById<RadioGroup>(R.id.radioGroup)
        val chbx= findViewById<CheckBox>(R.id.chbx)

        radioGroup.setOnCheckedChangeListener { radioGroup, i ->
            val setId:Int = radioGroup.checkedRadioButtonId
            radioButton = findViewById(setId)
            var result:String= radioButton.text.toString()
            Toast.makeText(this,result, Toast.LENGTH_SHORT).show()

        }

        chbx.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Toast.makeText(this,"checkbox is checked", Toast.LENGTH_SHORT).show()
            }
            if (!isChecked) {
                Toast.makeText(this,"checkbox is unchecked", Toast.LENGTH_SHORT).show()
            }
        }

    }
}