package com.example.saes4.ui.prestataire.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Filter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.saes4.R
import com.example.saes4.ui.prestataire.PresataireFragment
import com.example.saes4.ui.prestataire.model.Prestataire

class ItemAdapter(
    private val prestataireFragment: PresataireFragment,
    private val dataset: List<Prestataire>,


) : RecyclerView.Adapter<ItemAdapter.PrestataireViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PrestataireViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.prestataire_item, parent, false)



        return PrestataireViewHolder(adapterLayout)
    }
    override fun onBindViewHolder(holder: PrestataireViewHolder, position: Int) {
        val item = dataset[position]
        /*holder.trait.visibility = View.VISIBLE*/
        holder.firstname.setText(item.firstname)
        holder.surname.setText(item.surname)
        holder.standName.setText(item.nameStand)
        holder.description.setText(item.textPrestataire)
        holder.category.setText(item.category)
        holder.imagePrestataire.setImageResource(item.image)
        holder.voirPlus.setOnClickListener {view: View->
            Navigation.findNavController(view).navigate(R.id.fragment_prestaire_profil, bundleOf("presta" to position.toString()))
        }

    }

    override fun getItemCount() = dataset.size



    class PrestataireViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        /*val trait:View = view.findViewById(R.id.trait)*/
        val firstname: TextView = view.findViewById(R.id.firstname)
        val surname: TextView = view.findViewById(R.id.surname)
        val standName: TextView = view.findViewById(R.id.standName)
        val description: TextView = view.findViewById(R.id.description)
        val imagePrestataire: ImageView = view.findViewById(R.id.imagePrestataire)
        val category: TextView = view.findViewById(R.id.category)
        val voirPlus: Button = view.findViewById(R.id.voirPlus)
    }
}



