package com.example.youtubemusicuiclone.home

import com.example.youtubemusicuiclone.base.BaseViewHolder
import com.example.youtubemusicuiclone.databinding.AdapterMusicItemBinding
import com.example.youtubemusicuiclone.model.MusicUiModel

class MusicViewHolder(
    private val binding: AdapterMusicItemBinding
) : BaseViewHolder<MusicUiModel>(binding.root) {

    override fun onBind(data: MusicUiModel) {
        binding.musicComponent.setMusicUiData(data)
    }

}