package com.example.saes4.ui.calendrier.data

import com.example.saes4.R
import com.example.saes4.ui.calendrier.model.CalendarItem

class DatasourceCalendar {

    fun loadCalendar(): List<CalendarItem> {
        return listOf<CalendarItem>(
            CalendarItem(
                R.string.calendar_event_date_1,
                R.string.calendar_event_title_1,
                R.string.calendar_event_descrition_1
            ),
            CalendarItem(
                R.string.calendar_event_date_2,
                R.string.calendar_event_title_2,
                R.string.calendar_event_descrition_2
            ),
            CalendarItem(
                R.string.calendar_event_date_3,
                R.string.calendar_event_title_3,
                R.string.calendar_event_descrition_3
            ),
            CalendarItem(
                R.string.calendar_event_date_4,
                R.string.calendar_event_title_4,
                R.string.calendar_event_descrition_4
            ),
            CalendarItem(
                R.string.calendar_event_date_5,
                R.string.calendar_event_title_5,
                R.string.calendar_event_descrition_5
            ),
            CalendarItem(
                R.string.calendar_event_date_6,
                R.string.calendar_event_title_6,
                R.string.calendar_event_descrition_6
            ),
            CalendarItem(
                R.string.calendar_event_date_7,
                R.string.calendar_event_title_7,
                R.string.calendar_event_descrition_7
            ),
            CalendarItem(
                R.string.calendar_event_date_8,
                R.string.calendar_event_title_8,
                R.string.calendar_event_descrition_8
            )
        )
    }
}