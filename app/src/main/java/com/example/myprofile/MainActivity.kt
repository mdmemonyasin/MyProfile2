package com.example.myprofile

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    var photo:ImageView?=null
    var eduButton:Button?=null
    var workButton:Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        photo=findViewById(R.id.profilePhoto)
        photo?.setOnClickListener {
            var clickIntent=Intent(this@MainActivity,MyProfilePhoto::class.java)
            startActivity(clickIntent)
        }
        eduButton=findViewById(R.id.eduButton)
        eduButton?.setOnClickListener({
            var clickIntent=Intent(this@MainActivity,Education::class.java)
            startActivity(clickIntent)
        })
        workButton=findViewById(R.id.workButton)
        workButton?.setOnClickListener({
            var clickIntent=Intent(this@MainActivity,WorkExperience::class.java)
            startActivity(clickIntent)
        })
    }
}
