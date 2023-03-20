package com.example.saes4.ui.calendrier.data

import com.example.saes4.R
import com.example.saes4.ui.calendrier.model.CalendarItem

class DatasourceCalendar {

    fun loadCalendar(): List<CalendarItem> {
        return listOf<CalendarItem>(
            CalendarItem(
                R.string.calendar_event_date_1,
                R.string.nameStand1,
                R.string.firstname1,
                R.string.surname1,
                R.string.textPrestataire1
            )
        )
    }
}