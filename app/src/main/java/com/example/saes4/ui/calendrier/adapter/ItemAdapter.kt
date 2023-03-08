package com.example.saes4.ui.calendrier.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.saes4.R
import com.example.saes4.ui.calendrier.CalendrierFragment
import com.example.saes4.ui.calendrier.model.CalendarItem

class ItemAdapter(
    private val calendrierFragment: CalendrierFragment,
    private val calendarDataset: List<CalendarItem>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.calendar_item, parent, false)

        return CalendarViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int {
        return calendarDataset.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
        val item = calendarDataset[position]
//        holder.itemCalendar

    }

    class CalendarViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val itemCalendaar: TextView = view.findViewById(R.id.calendar_item)
    }
}
