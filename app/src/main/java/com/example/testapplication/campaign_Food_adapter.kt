package com.example.testapplication
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class campaign_Food_adapter(val foodList: ArrayList<Campaign_food>): RecyclerView.Adapter<campaign_Food_adapter.ViewHolder>()  {


    override fun getItemCount()= foodList.size



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = foodList[position]
        holder.foodName.text = item.foodName
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): campaign_Food_adapter.ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.horizontal_available_campaign,parent, false)
        return  ViewHolder(view)
    }
    class  ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val foodName : TextView = itemView.findViewById(R.id.food_title)
        val foodType : TextView = itemView.findViewById(R.id.foodType)
        val SKU : TextView = itemView.findViewById(R.id.SKU)

        val skuQuantity : TextView = itemView.findViewById(R.id.skuQuantity)
        val demandQuantity : TextView = itemView.findViewById(R.id.demandQuantity)
        val quantity : TextView = itemView.findViewById(R.id.quantity)
    }
}