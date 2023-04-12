package com.example.youtubemusicuiclone.home

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.youtubemusicuiclone.base.BaseRecyclerViewAdapter
import com.example.youtubemusicuiclone.databinding.AdapterListAgainItemBinding
import com.example.youtubemusicuiclone.model.MusicUiModel

class ListAgainRecyclerViewAdapter(listAgain: MutableList<MusicUiModel>) :
    BaseRecyclerViewAdapter<MusicUiModel, ListAgainViewHolder>() {

    init {
        list.addAll(listAgain)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAgainViewHolder {
        val binding =
            AdapterListAgainItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListAgainViewHolder(binding)
    }
}