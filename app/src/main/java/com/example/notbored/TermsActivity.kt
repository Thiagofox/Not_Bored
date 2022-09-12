package com.example.notbored

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.notbored.databinding.ActivityMainBinding
import com.example.notbored.databinding.ActivityTermsBinding

class TermsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTermsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTermsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.imageClose.setOnClickListener {
//          Toast.makeText(this, "FUI CLICADO", Toast.LENGTH_LONG).show()
            finish()
        }

    }

//    override fun onClick(view: View) {
//        Toast.makeText(this, "FUI CLICADO", Toast.LENGTH_LONG).show()
//    }
}