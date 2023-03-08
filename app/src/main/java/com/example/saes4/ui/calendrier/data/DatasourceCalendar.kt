package com.example.saes4.ui.calendrier.data

import com.example.saes4.R
import com.example.saes4.ui.calendrier.model.CalendarItem

class DatasourceCalendar {

    fun loadCalendar(): List<CalendarItem> {
        return listOf<CalendarItem>(
            CalendarItem(R.string.calendar_item_1.toString()),
            CalendarItem(R.string.calendar_item_2.toString()),
            CalendarItem(R.string.calendar_item_3.toString())
        )
    }

}