package com.example.testapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.example.testapplication.databinding.ActivityCampaignDetailBinding
import com.example.testapplication.databinding.FragmentCampaignAvailableBinding


class campaign_list : AppCompatActivity() {

    lateinit var  FragmentBinding: FragmentCampaignAvailableBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_campaign_list)



        FragmentBinding = FragmentCampaignAvailableBinding.inflate(layoutInflater)
        val cardView : CardView = findViewById(R.id.campaign_available_title_card)
        cardView.setOnClickListener{
                view->
            val intent = Intent(this,campaign_detail::class.java)
            startActivity(intent)
        }
}
}