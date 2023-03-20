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
            ),
            CalendarItem(
                R.string.calendar_event_date_2,
                R.string.nameStand2,
                R.string.firstname2,
                R.string.surname2,
                R.string.textPrestataire2
            ),
            CalendarItem(
                R.string.calendar_event_date_3,
                R.string.nameStand3,
                R.string.firstname3,
                R.string.surname3,
                R.string.textPrestataire3
            ),
            CalendarItem(
                R.string.calendar_event_date_4,
                R.string.nameStand4,
                R.string.firstname4,
                R.string.surname4,
                R.string.textPrestataire4
            ),
            CalendarItem(
                R.string.calendar_event_date_5,
                R.string.nameStand5,
                R.string.firstname5,
                R.string.surname5,
                R.string.textPrestataire5
            ),
            CalendarItem(
                R.string.calendar_event_date_6,
                R.string.nameStand6,
                R.string.firstname6,
                R.string.surname6,
                R.string.textPrestataire6
            ),
            CalendarItem(
                R.string.calendar_event_date_7,
                R.string.nameStand7,
                R.string.firstname7,
                R.string.surname7,
                R.string.textPrestataire7
            ),
            CalendarItem(
                R.string.calendar_event_date_8,
                R.string.nameStand8,
                R.string.firstname8,
                R.string.surname8,
                R.string.textPrestataire8
            )
        )
    }
}