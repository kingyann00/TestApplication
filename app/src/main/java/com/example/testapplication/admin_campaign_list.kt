package com.example.testapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testapplication.databinding.FragmentAdminCampaignlistBinding
import com.example.testapplication.databinding.FragmentCampaignAvailableBinding

class admin_campaign_list : AppCompatActivity() {
    lateinit var binding: FragmentAdminCampaignlistBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentAdminCampaignlistBinding.inflate(layoutInflater)

        setContentView(R.layout.activity_admin_campaign_list)


    }

}