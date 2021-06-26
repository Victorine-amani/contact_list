package com.example.contact_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var contacts:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        contacts=findViewById(R.id.rvContacts)

        val contacts1= listOf(
            Contacts("Victorine Amani","07123456789","victorine@gmail.com","https://bit.ly/3gYZgZG"),
            Contacts("Favour Kimori","0712345098","favour@gmail.com","https://bit.ly/3A0D8GV"),
            Contacts("Hezborn Omondi","0798653412","Hezborn@gmail.com","https://bit.ly/3vYf58r"),
            Contacts("Elizabeth Imaa","0795683412","imaa@gmail.com","https://bit.ly/35Ukxys"),
            Contacts("Richard Omutoj","0730812539","omutoj@gmail.com","https://bit.ly/3A2H2Pq"),
            Contacts("Aaron Imaa","0760423498","aaron@gmail.com","https://bit.ly/3A06lBN"))


          var contactsAdapter=DetailsRecyclerViewAdapter(contacts1,baseContext)
        contacts.layoutManager= LinearLayoutManager(baseContext)
        contacts.adapter=contactsAdapter
    }
}