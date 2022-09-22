package com.example.testapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostsAdapter(val posts: ArrayList<String>): RecyclerView.Adapter<PostsAdapter.ViewHolder>() {
    override fun getItemCount()= posts.size



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.firstName.text = "Justin Bieber"
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostsAdapter.ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.horizontal_available_campaign,parent, false)
        return  ViewHolder(view)
    }
    class  ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
            val firstName : TextView = itemView.findViewById(R.id.firstName)
    }
}