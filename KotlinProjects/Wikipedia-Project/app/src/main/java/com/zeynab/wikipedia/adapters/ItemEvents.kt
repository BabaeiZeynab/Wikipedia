package com.zeynab.wikipedia.adapters

import com.zeynab.wikipedia.data.ItemPost

interface ItemEvents {

    fun onItemClicked(itemPost: ItemPost)
}