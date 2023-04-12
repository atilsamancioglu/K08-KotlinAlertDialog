package com.atilsamancioglu.kotlinalertdialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Context

        //Activity Context -> this
        //App Context -> applicationContext


        Toast.makeText(this@MainActivity,"Welcome",Toast.LENGTH_LONG).show()


        /*
        button.setOnClickListener(object:View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity,"test2",Toast.LENGTH_LONG).show()
            }
        })

         */


    }

    fun save(view : View) {

        val alert = AlertDialog.Builder(this@MainActivity)
        alert.setTitle("Save")
        alert.setMessage("Are You Sure?")

        alert.setPositiveButton("Yes") {dialog, which ->

            //OnClick Listener
            Toast.makeText(this,"Saved",Toast.LENGTH_LONG).show()
        }
        alert.setNegativeButton("No") {dialog, which ->

            //OnClick Listener
            Toast.makeText(applicationContext,"Not Saved",Toast.LENGTH_LONG).show()

        }

        alert.show()

    }
}
