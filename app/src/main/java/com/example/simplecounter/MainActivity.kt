package com.example.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

//Make sure all libraries are imported

class MainActivity : AppCompatActivity() {

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        val textView = findViewById<TextView>(R.id.textView)

        val upgradeButton = findViewById<Button>(R.id.upgradeBtn)

        button.setOnClickListener{
            //Button listener to handle user interaction
            //Toast.makeText(it.context, "Clicked Button!", Toast.LENGTH_SHORT).show()
            counter++
            textView.text = counter.toString()
            //When counter is >= 100 show upgrade button and set onclicklistener
            if(counter >= 100){
                upgradeButton.visibility = View.VISIBLE
                upgradeButton.setOnClickListener{
                   // button.text = "Add 2"

                    //Update original button to add 2
                    button.setOnClickListener {
                        counter += 2;
                        textView.text = counter.toString()
                    }

                    upgradeButton.visibility = View.INVISIBLE

                }
            }


        }


    }


}