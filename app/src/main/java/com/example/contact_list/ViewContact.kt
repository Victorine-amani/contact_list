package com.example.contact_list

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class ViewContact : AppCompatActivity() {
    lateinit var name:TextView
    lateinit var phone:TextView
    lateinit var email:TextView
    lateinit var image:ImageView
    lateinit var image2:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_contact)
        name=findViewById(R.id.tvName2)
        phone=findViewById(R.id.tvPhone2)
        email=findViewById(R.id.tvEmail2)
        image=findViewById(R.id.imgPerson1)
        image2=findViewById(R.id.imgBack)

        var intent=intent
        name.text=intent.getStringExtra("Name")
        phone.text=intent.getStringExtra("Phone")
        email.text=intent.getStringExtra("emailAddress")
        var img=intent.getStringExtra("image").toString()
        Picasso.get().load(img).into(image)
        image2.setOnClickListener {
            var intent=Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }


    }
}