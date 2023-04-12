package com.example.youtubemusicuiclone.component

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import androidx.core.view.isVisible
import com.example.youtubemusicuiclone.databinding.LayoutMusicBinding
import com.example.youtubemusicuiclone.model.MusicUiModel

class MusicUiComponent @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attributeSet, defStyleAttr) {

    private val binding = LayoutMusicBinding
        .inflate(LayoutInflater.from(context), this, false)

    init {
        addView(binding.root)
    }

    fun setMusicUiData(musicUiModel: MusicUiModel) {
        binding.image.setImageResource(musicUiModel.image)
        binding.name.text = musicUiModel.name
        binding.detail.text = musicUiModel.detail
    }


    fun setMusicDetailVisibility(isVisible: Boolean) {
        isVisible.also { binding.detail.isVisible = it }
    }

}