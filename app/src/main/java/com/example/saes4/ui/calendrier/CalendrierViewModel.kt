package com.example.saes4.ui.calendrier

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalendrierViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Calendrier Fragment"
    }
    val text: LiveData<String> = _text
}