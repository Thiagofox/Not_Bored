package com.example.notbored

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.notbored.databinding.ActivityActivitiesListBinding

class ActivitiesListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityActivitiesListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityActivitiesListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        initRecyclerView()

    }

    private fun initRecyclerView() {
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = AdapterItem(getList())
    }

    private fun getList() = listOf(
        "Education",
        "Recreational",
        "Social",
        "Diy",
        "Charity",
        "Cooking",
        "Relaxation",
        "Music",
        "Busywork",
    )
}