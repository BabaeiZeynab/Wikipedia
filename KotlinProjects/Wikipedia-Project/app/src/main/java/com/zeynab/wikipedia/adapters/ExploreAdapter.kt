package com.zeynab.wikipedia.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.zeynab.wikipedia.data.ItemPost
import com.zeynab.wikipedia.databinding.ItemExploreBinding

class ExploreAdapter(private val data: ArrayList<ItemPost>, val itemEvents: ItemEvents) :
        RecyclerView.Adapter<ExploreAdapter.ExploreViewHolder>() {

    lateinit var binding: ItemExploreBinding

    inner class ExploreViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        // we create function that can use in onBindingViewHolder

        fun bindView(itemPost: ItemPost) {

            val glide = Glide.with(itemView.context).load(itemPost.imgURL).into(binding.imgExploreMain)
            binding.txtExploreTitle.text = itemPost.txtTitle
            binding.txtExploreSubtitle.text = itemPost.txtSubTitle
            binding.txtExploreDetails.text = itemPost.txtDetails

            itemView.setOnClickListener {
                itemEvents.onItemClicked(itemPost)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExploreViewHolder {

        binding = ItemExploreBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        val exploreView = binding.root
        return ExploreViewHolder(exploreView)
    }


    override fun onBindViewHolder(holder: ExploreViewHolder, position: Int) {
        holder.bindView(data[position])
    }


    override fun getItemCount(): Int {

        return data.size
    }


    fun setData(newList: ArrayList<ItemPost>) {

        data.clear()
        data.addAll(newList)
        notifyDataSetChanged()
    }


}


