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
) : RecyclerView.Adapter<ItemAdapter.CalendarViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CalendarViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.calendar_item, parent, false)

        return CalendarViewHolder(adapterLayout)
    }



    override fun onBindViewHolder(holder: CalendarViewHolder, position: Int) {
        val item = calendarDataset[position]
        holder.event_date.setText(item.date)
        holder.event_title.setText(item.title)


    }

    override fun getItemCount(): Int {
        return calendarDataset.size
    }


    class CalendarViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val event_date: TextView = view.findViewById(R.id.calendar_event_date)
        val event_title: TextView = view.findViewById(R.id.calendar_event_title)
    }
}
