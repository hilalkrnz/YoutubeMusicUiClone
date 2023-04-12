package com.example.youtubemusicuiclone.home

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.youtubemusicuiclone.base.BaseRecyclerViewAdapter
import com.example.youtubemusicuiclone.databinding.AdapterMusicItemBinding
import com.example.youtubemusicuiclone.model.MusicUiModel

class MusicRecyclerViewAdapter(musicList: MutableList<MusicUiModel>) :
    BaseRecyclerViewAdapter<MusicUiModel, MusicViewHolder>() {

    init {
        list.addAll(musicList)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        val binding =
            AdapterMusicItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MusicViewHolder(binding)
    }
}