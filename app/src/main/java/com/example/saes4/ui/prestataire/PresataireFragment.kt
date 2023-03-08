package com.example.saes4.ui.prestataire

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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


        var DatasourcePrestataire = DataPrestataire().loadPrestataire()
        var recyclerView: RecyclerView = view.findViewById(R.id.recyclerPrestataire)

        recyclerView.adapter = ItemAdapter(this, DatasourcePrestataire)

        recyclerView.setHasFixedSize(true)
    }
}

class Prestataire(
    var firstname: String,
    var surname: String,
    var image: String,
    val nameStand: String,
    val category: String,
    val textPrestataire: String
)