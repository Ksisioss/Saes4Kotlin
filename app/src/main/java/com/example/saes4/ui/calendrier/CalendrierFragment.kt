package com.example.saes4.ui.calendrier

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.saes4.R
import com.example.saes4.databinding.FragmentCalendrierBinding
import com.example.saes4.ui.calendrier.adapter.ItemAdapter
import com.example.saes4.ui.calendrier.data.DatasourceCalendar

class CalendrierFragment : Fragment() {

    private var _binding: FragmentCalendrierBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val calendrierViewModel =
            ViewModelProvider(this).get(CalendrierViewModel::class.java)

        _binding = FragmentCalendrierBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textCalendrier
        calendrierViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
        }
        return root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Récupérer la liste des item dans le calendrier
        val calendarDataset = DatasourceCalendar().loadCalendar()
        // Récupérer le recycle view du calendrier
        val recyclerView: RecyclerView = view.findViewById(R.id.recycler_view_calendar)

        recyclerView.adapter = ItemAdapter(this, calendarDataset)

        recyclerView.setHasFixedSize(true)
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}