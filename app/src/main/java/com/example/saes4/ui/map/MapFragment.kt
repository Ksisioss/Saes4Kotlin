package com.example.saes4.ui.calendrier

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.saes4.R
import com.example.saes4.databinding.FragmentMapBinding

class MapFragment : Fragment() {

    private var _binding: FragmentMapBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val mapViewModel =
            ViewModelProvider(this).get(MapViewModel::class.java)

        _binding = FragmentMapBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textMap
        mapViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
        }

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val marker1: ImageView = view.findViewById(R.id.marker1);
        marker1.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.fragment_prestaire_profil, bundleOf("presta" to "1"))
        }
        val marker2: ImageView = view.findViewById(R.id.marker2);
        marker2.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.fragment_prestaire_profil, bundleOf("presta" to "2"))
        }
        val marker3: ImageView = view.findViewById(R.id.marker3);
        marker3.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.fragment_prestaire_profil, bundleOf("presta" to "3"))
        }
        val marker4: ImageView = view.findViewById(R.id.marker4);
        marker4.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.fragment_prestaire_profil, bundleOf("presta" to "4"))
        }
        val marker5: ImageView = view.findViewById(R.id.marker5);
        marker5.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.fragment_prestaire_profil, bundleOf("presta" to "5"))
        }
        val marker6: ImageView = view.findViewById(R.id.marker6);
        marker6.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.fragment_prestaire_profil, bundleOf("presta" to "6"))
        }
        val marker7: ImageView = view.findViewById(R.id.marker7);
        marker7.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.fragment_prestaire_profil, bundleOf("presta" to "7"))
        }
        val marker8: ImageView = view.findViewById(R.id.marker8);
        marker8.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.fragment_prestaire_profil, bundleOf("presta" to "0"))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}