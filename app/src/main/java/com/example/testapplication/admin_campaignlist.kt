package com.example.testapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testapplication.databinding.FragmentAdminCampaignlistBinding
import com.example.testapplication.databinding.FragmentCampaignAvailableBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [admin_campaignlist.newInstance] factory method to
 * create an instance of this fragment.
 */
class admin_campaignlist : Fragment() {
    // TODO: Rename and change types of parameters
    lateinit var binding: FragmentAdminCampaignlistBinding
    private var campaignList = ArrayList<Campaign>()

    lateinit var campaignTitle: Array<String>
    lateinit var location: Array<String>
    lateinit var campaign_date: Array<String>
    lateinit var campaign_time: Array<String>
    lateinit var campaignImg: Array<Int>


    private lateinit var adminCampaignlist_Adapter : admin_campaign_list_adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_admin_campaignlist, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        //prepareItems()
        dataIntialize()
        val recyclerView: RecyclerView = view.findViewById(R.id.admincampaign_list)
        adminCampaignlist_Adapter = admin_campaign_list_adapter(campaignList)
        val layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager

        recyclerView.adapter = adminCampaignlist_Adapter




    }
//    private fun prepareItems() {
//        for(i in 1..100) {
//            campaignList.add("POST # $i")
//        }
//
//    }

        private fun dataIntialize() {


            campaignTitle = arrayOf(
                "Food 1", "Food 2", "Food 3", "Food 4", "Food 6", "Food 5"
            )

            location = arrayOf(
                "Frozen Food",
                "Frozen Food",
                "Dry Food",
                "Frozen Food",
                "Frozen Food",
                "Frozen Food"
            )
            campaign_date = arrayOf(
                "9/24/2022","9/24/2022","9/24/2022","9/24/2022","9/24/2022","9/24/2022"
            )
            campaign_time = arrayOf(
               "09:18:00","09:18:00","09:18:00","09:18:00","09:18:00","09:18:00"
            )
            campaignImg = arrayOf(
                R.drawable.campaign_img_test,
                R.drawable.campaign_img_test,
                R.drawable.campaign_img_test,
                R.drawable.campaign_img_test,
                R.drawable.campaign_img_test,
                R.drawable.campaign_img_test
            )



            campaignList = ArrayList()
            for (i in campaignTitle.indices) {
                val campaign = Campaign(
                    campaignImg[i],
                    campaignTitle[i],
                    location[i],
                    campaign_date[i],
                    campaign_time[i]

                )
                campaignList.add(campaign)

            }
        }


}