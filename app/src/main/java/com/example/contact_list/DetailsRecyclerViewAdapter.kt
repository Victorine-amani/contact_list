package com.example.contact_list

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class DetailsRecyclerViewAdapter(var contactList:List<Contacts>, var context:Context) :RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        val itemView= LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,false)
        return ContactsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val currentData= contactList[position]
        holder.personName.text=currentData.name
        holder.phone.text=currentData.phoneNumber
        holder.address.text=currentData.email
        Picasso.get().load(currentData.imageUrl).into(holder.image)
        holder.layout.setOnClickListener {
            var intent= Intent(context,ViewContact::class.java)
                intent.putExtra("Name", currentData.name)
                intent.putExtra("Phone", currentData.phoneNumber)
                intent.putExtra("emailAddress", currentData.email)
                intent.putExtra("image",currentData.imageUrl )
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
         return contactList.size
    }
}

class ContactsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var personName=itemView.findViewById<TextView>(R.id.tvName)
    var phone=itemView.findViewById<TextView>(R.id.tvPhone)
    var address=itemView.findViewById<TextView>(R.id.tvEmail)
    var image=itemView.findViewById<ImageView>(R.id.imgPerson)
    var layout=itemView.findViewById<ConstraintLayout>(R.id.clContact)

}