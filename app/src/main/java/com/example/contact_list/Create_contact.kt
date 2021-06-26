package com.example.contact_list

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Create_contact : AppCompatActivity() {
    lateinit var name1: EditText
    lateinit var phone1: EditText
    lateinit var email1: EditText
    lateinit var button1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_contact)
        name1 = findViewById(R.id.etName)
        phone1 = findViewById(R.id.etPhone)
        email1 = findViewById(R.id.etEmail)
        val names = name1.text.toString()
        val phones = phone1.text.toString()
        val emails = email1.text.toString()


    }
}