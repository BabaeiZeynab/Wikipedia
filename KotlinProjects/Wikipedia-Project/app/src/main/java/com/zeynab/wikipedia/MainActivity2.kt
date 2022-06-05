package com.zeynab.wikipedia

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bumptech.glide.Glide
import com.zeynab.wikipedia.data.ItemPost
import com.zeynab.wikipedia.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    lateinit var binding : ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val postData = intent.getParcelableExtra<ItemPost>("sendData")
        
        
        if(postData != null){
            
            showData(postData)
        }
    }

    private fun showData(itemPost: ItemPost) {

        val glide = Glide.with(this).load(itemPost.imgURL).into(binding.imgDetail)

        binding.titleDetials.text = itemPost.txtTitle
        binding.bornDetails.text = itemPost.born
        binding.activeDetails.text = itemPost.active
        binding.lifeDetails.text = itemPost.life

        binding.fabwikipedia.setOnClickListener {

            val url = "https://en.wikipedia.org/wiki/Main_Page"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }


    }


}