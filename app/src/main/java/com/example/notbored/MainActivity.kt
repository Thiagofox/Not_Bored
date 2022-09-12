package com.example.notbored

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.notbored.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener{

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
        // Click do TERMOS E CONDIÇOES
        binding.textTermsMain.setOnClickListener(this)
        // CLick do botão START
        binding.buttonStart.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        if (view.id == R.id.text_terms_main) {
            handleClickTerm()
        }
        else if (view.id == R.id.button_start)
            handleClickButtonStart()
    }

    // Quando clicado nos termos -> da start na activity [TermsActivity]
    private fun handleClickTerm() {
        val intentTerms = Intent(this, TermsActivity::class.java)
        startActivity(intentTerms)
    }
    // Quando clicado nos termos -> da start na activity [ActivitiesList]
    private fun handleClickButtonStart() {
        val intentActivitiesList = Intent(this, ActivitiesListActivity::class.java)
        startActivity(intentActivitiesList)
    }



}