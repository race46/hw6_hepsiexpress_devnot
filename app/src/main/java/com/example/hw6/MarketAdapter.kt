package com.example.hw6

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.hw6.databinding.UrunBinding

class MarketAdapter(private val urun: ArrayList<Model>) :
    RecyclerView.Adapter<MarketAdapter.MarketViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarketViewHolder {
        val itemMarketBinding: UrunBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.urun, parent, false)
        return MarketViewHolder(itemMarketBinding)
    }
    override fun onBindViewHolder(holder: MarketViewHolder, position: Int) {
        holder.binding.urun = urun[position]
    }

    override fun getItemCount(): Int = urun.size

    class MarketViewHolder(val binding: UrunBinding) : RecyclerView.ViewHolder(binding.root)
}