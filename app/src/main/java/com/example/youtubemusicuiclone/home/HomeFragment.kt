package com.example.youtubemusicuiclone.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.youtubemusicuiclone.R
import com.example.youtubemusicuiclone.databinding.FragmentHomeBinding
import com.example.youtubemusicuiclone.model.MusicUiModel

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val musicList = mutableListOf<MusicUiModel>()
        val m1 = MusicUiModel(1, R.drawable.rock, "Turkish Rock Road Trip", "Teoman, Dedublüman, Mor ve Ötesi, Ufuk Beydemir")
        val m2 = MusicUiModel(2, R.drawable.feelgood, "Feel-Good Rock Hits", "Supergrass, Bon Jovi, Good Charlotte, Weezer")
        val m3 = MusicUiModel(3, R.drawable.anatolianrock, "Anatolian Rock Classics", "Barış Manço, Moğollar, Cem Karaca, Erkin Koray")
        val m4 = MusicUiModel(4, R.drawable.energetic, "Energetic Turkish Rock", "Duman, maNga, Athena, Adamlar")
        musicList.add(m1)
        musicList.add(m2)
        musicList.add(m3)
        musicList.add(m4)

        val listAgain = mutableListOf<MusicUiModel>()
        val l1 = MusicUiModel(1, R.drawable.trip, "ACID TRIP", "")
        val l2 = MusicUiModel(2, R.drawable.resistance, "The Resistance", "")
        val l3 = MusicUiModel(3, R.drawable.faint, "Faint", "")
        val l4 = MusicUiModel(4, R.drawable.waves, "Heat Waves", "")
        listAgain.add(l1)
        listAgain.add(l2)
        listAgain.add(l3)
        listAgain.add(l4)

        binding = FragmentHomeBinding.inflate(layoutInflater).apply {
            val adapter = MusicRecyclerViewAdapter(musicList)
            recyclerView.adapter = adapter
            rv.adapter = adapter

            val listAgainAdapter = ListAgainRecyclerViewAdapter(listAgain)
            recyclerViewListAgain.adapter = listAgainAdapter
        }
        return binding.root
    }



}