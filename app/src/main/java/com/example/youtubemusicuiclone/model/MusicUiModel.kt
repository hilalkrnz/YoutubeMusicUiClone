package com.example.youtubemusicuiclone.model

import java.io.Serializable

data class MusicUiModel(
    var id: Int,
    var image: Int,
    var name: String,
    var detail: String
) : Serializable


