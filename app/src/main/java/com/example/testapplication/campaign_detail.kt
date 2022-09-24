package com.example.testapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testapplication.databinding.ActivityCampaignDetailBinding

class campaign_detail : AppCompatActivity() {
    private lateinit var binding: ActivityCampaignDetailBinding
    private lateinit var foodAdapter:campaign_Food_adapter
    lateinit var foodArrayList: ArrayList<Campaign_food>

    lateinit var foodName: Array<String>
    lateinit var foodType: Array<String>
    lateinit var SKU: Array<String>

    lateinit var skuQuantity: Array<Int>
    lateinit var demandQuantity: Array<Int>
    lateinit var quantity: Array<Int>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_campaign_detail)



    }



//    private fun dataIntialize(){
//        foodName = arrayOf(
//            "Food 1", "Food 2", "Food 3", "Food 4", "Food 6","Food 5"
//        )
//
//        foodType = arrayOf(
//            "Frozen Food", "Frozen Food", "Dry Food", "Frozen Food", "Frozen Food","Frozen Food"
//        )
//        SKU = arrayOf(
//            "kg", "gram", "kg", "kg", "kg","kg"
//        )
//        skuQuantity = arrayOf(
//            10, 500, 10, 10, 20,30
//        )
//        demandQuantity = arrayOf(
//            50, 50, 50, 50, 20,10
//        )
//        quantity = arrayOf(
//            40, 39, 20, 30, 16,15
//        )
//
//
//        foodArrayList = ArrayList()
//        for(i in foodName.indices){
//            val food = Campaign_food(foodName[i], foodType[i], SKU[i], skuQuantity[i], demandQuantity[i],quantity[i])
//            foodArrayList.add(food)
//
//        }
//
//
//
//
//
//    }
}