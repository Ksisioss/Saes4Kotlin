package com.example.saes4.ui.prestataire

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.saes4.R
import com.example.saes4.databinding.FragmentPrestataireBinding
import com.example.saes4.ui.prestataire.adapter.ItemAdapter
import com.example.saes4.ui.prestataire.data.DataPrestataire

class PresataireFragment : Fragment() {

    private var _binding: FragmentPrestataireBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val prestataireViewModel =
            ViewModelProvider(this).get(PrestataireViewModel::class.java)

        _binding = FragmentPrestataireBinding.inflate(inflater, container, false)
        val root: View = binding.root

        //val textView: TextView = binding.textPrestataire
        prestataireViewModel.text.observe(viewLifecycleOwner) {
            // textView.text = it
        }


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dataPrestataire = DataPrestataire()
        val dataSourcePrestataire = DataPrestataire().loadPrestataire()
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerPrestataire)
        val btnActivite:Button = view.findViewById(R.id.activite)
        val btnFood:Button = view.findViewById(R.id.food)
        val btnSpectacle:Button = view.findViewById(R.id.spectacle)
        val btnAll:Button = view.findViewById(R.id.all)

        btnActivite.setOnClickListener { recyclerView.adapter = ItemAdapter(this, dataPrestataire.getPrestataireActivite()) } // appeler la méthode getPrestataireActivite() sur l'instance de DataPrestataire
        btnFood.setOnClickListener { recyclerView.adapter = ItemAdapter(this, dataPrestataire.getPrestataireFood()) } // appeler la méthode getPrestataireActivite() sur l'instance de DataPrestataire
        btnSpectacle.setOnClickListener { recyclerView.adapter = ItemAdapter(this, dataPrestataire.getPrestataireSpectacle()) } // appeler la méthode getPrestataireActivite() sur l'instance de DataPrestataire
        btnAll.setOnClickListener { recyclerView.adapter = ItemAdapter(this, dataSourcePrestataire) } // appeler la méthode getPrestataireActivite() sur l'instance de DataPrestataire


        recyclerView.adapter = ItemAdapter(this, dataSourcePrestataire)

        recyclerView.setHasFixedSize(true)
    }
}