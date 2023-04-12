package com.example.youtubemusicuiclone.base

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

abstract class BaseRecyclerViewAdapter<T: Any, VH: BaseViewHolder<T>> : RecyclerView.Adapter<VH>() {

    val list = mutableListOf<T>()

    fun getItem(position: Int) = list[position]

    abstract override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.onBind(list[position])
    }
}