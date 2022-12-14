package com.example.testapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testapplication.databinding.ActivityCampaignDetailBinding
import com.example.testapplication.databinding.FragmentCampaignAvailableBinding
import android.content.Intent
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [campaign_available.newInstance] factory method to
 * create an instance of this fragment.
 */
class campaign_available : Fragment() {
    // TODO: Rename and change types of parameters

    lateinit var binding: FragmentCampaignAvailableBinding
    private var itemsList = ArrayList<String>()
    private lateinit var customAdapter: PostsAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        return inflater.inflate(R.layout.fragment_campaign_available, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val posts: ArrayList<String> = ArrayList()
//        binding.campaignAvailableRecyclerView.layoutManager = LinearLayoutManager(context)
//        binding.campaignAvailableRecyclerView.setHasFixedSize(true)
//
//        binding.campaignAvailableRecyclerView.adapter = PostsAdapter(posts)
//
//        for(i in 1..100){
//            posts.add("POST # $i")


        prepareItems()
        val recyclerView: RecyclerView = view.findViewById(R.id.campaign_available_RecyclerView)
        customAdapter = PostsAdapter(itemsList)
        val layoutManager = LinearLayoutManager(context)

        recyclerView?.layoutManager = LinearLayoutManager(
            context,
            LinearLayoutManager.HORIZONTAL, false)

        recyclerView.adapter = customAdapter




    }
    private fun prepareItems() {
        for(i in 1..100) {
            itemsList.add("POST # $i")
        }

    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment campaign_available.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            campaign_available().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}