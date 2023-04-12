package com.example.youtubemusicuiclone.home

import com.example.youtubemusicuiclone.base.BaseViewHolder
import com.example.youtubemusicuiclone.databinding.AdapterListAgainItemBinding
import com.example.youtubemusicuiclone.model.MusicUiModel

class ListAgainViewHolder(
    private val binding: AdapterListAgainItemBinding
) : BaseViewHolder<MusicUiModel>(binding.root) {
    override fun onBind(data: MusicUiModel) {
        binding.musicComponent.setMusicUiData(data)
        binding.musicComponent.setMusicDetailVisibility(false)
    }


}