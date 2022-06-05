package com.zeynab.wikipedia.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.zeynab.wikipedia.data.ItemPost
import com.zeynab.wikipedia.databinding.ItemTrendBinding

class TrendAdapter(private val data: ArrayList<ItemPost>, val itemEvents: ItemEvents) :
    RecyclerView.Adapter<TrendAdapter.TrendViewHolder>() {


    lateinit var binding: ItemTrendBinding

    inner class TrendViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        fun bindView(itemPost: ItemPost) {
            val glide = Glide.with(itemView.context).load(itemPost.imgURL).into(binding.imgTrend)
            binding.txtTrendTitle.text = itemPost.txtTitle
//            binding.txtTrendSubTitle.text = itemPost.txtSubTitle
            binding.trendInsight.text = itemPost.insight + " Likes"
            binding.txtTrendBorn.text = itemPost.born
            binding.txtTrendLife.text = itemPost.life
            binding.txtTrendActive.text = itemPost.active


            /// set up our Interface
            itemView.setOnClickListener {
                itemEvents.onItemClicked(itemPost)
            }

        }

    }


    override fun onBindViewHolder(holder: TrendViewHolder, position: Int) {
        holder.bindView(data[position])


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrendViewHolder {
        binding = ItemTrendBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TrendViewHolder(binding.root)

    }


    override fun getItemCount(): Int {
        return data.size
    }


}