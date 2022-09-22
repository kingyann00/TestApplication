package com.example.testapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)

        val campaignCreate_Button : Button = findViewById(R.id.donor_campaign_create_button)
        val campaignList_Button : Button = findViewById(R.id.donor_campaign_list_button)

        val campaignDetail_Button : Button = findViewById(R.id.donorCampaignDetailButton)
        val admincampaignlist_Button : Button = findViewById(R.id.admincampaignlistButton)

        campaignCreate_Button.setOnClickListener{
                view->
            val intent = Intent(this,campaign_create::class.java)
            startActivity(intent)
        }
        campaignList_Button.setOnClickListener{
                view->
            val intent = Intent(this,campaign_list::class.java)
            startActivity(intent)
        }
        campaignDetail_Button.setOnClickListener{
            view->
            val intent = Intent(this,campaign_detail::class.java)
            startActivity(intent)
        }

        admincampaignlist_Button.setOnClickListener{
                view->
            val intent = Intent(this,admin_campaign_list::class.java)
            startActivity(intent)
        }

//        val posts: ArrayList<String> = ArrayList()
//
//        for(i in 1..100){
//            posts.add("POST # $i")
//        }
//
//        binding.campaignAvailableRecyclerView.layoutManager = LinearLayoutManager(this)
//        binding.campaignAvailableRecyclerView.setHasFixedSize(true)
//
//        binding.campaignAvailableRecyclerView.adapter = PostsAdapter(posts)
    }
}