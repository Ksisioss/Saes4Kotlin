package com.example.saes4.ui.prestataire.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.saes4.R
import com.example.saes4.ui.calendrier.CalendrierFragment
import com.example.saes4.ui.prestataire.PresataireFragment
import com.example.saes4.ui.prestataire.Prestataire

class ItemAdapter(
    private val prestataireFragment: PresataireFragment,
    private val dataset: List<Prestataire>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_prestataire, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.itemPrestataire.text = item.toString()

    }

    override fun getItemCount() = dataset.size

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val itemPrestataire: TextView = view.findViewById(R.id.recyclerPrestataire)
    }
}



