package com.example.testapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class admin_campaign_list_adapter(val campaignList: ArrayList<Campaign>): RecyclerView.Adapter<admin_campaign_list_adapter.ViewHolder>() {

        override fun getItemCount()= campaignList.size



        override fun onBindViewHolder(holder: ViewHolder, position: Int) {

            holder.campaignImg.setBackgroundResource(campaignList[position].campaignImg)
            holder.campaignTitle.text = campaignList[position].campaignTitle
            holder.location.text = campaignList[position].location
            holder.campaign_date.text = campaignList[position].campaign_date
            holder.campaign_time.text = campaignList[position].campaign_time


        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): admin_campaign_list_adapter.ViewHolder {
            val view: View = LayoutInflater.from(parent.context).inflate(R.layout.admincampaign_list,parent, false)
            return  ViewHolder(view)
        }
        class  ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
            val campaignImg  : ImageView = itemView.findViewById(R.id.campaign_Image)
            val campaignTitle  : TextView = itemView.findViewById(R.id.campaignTitle)
            val location : TextView = itemView.findViewById(R.id.location)
            val campaign_date : TextView = itemView.findViewById(R.id.campaign_date)
            val campaign_time : TextView = itemView.findViewById(R.id.campaign_time)
        }
    }