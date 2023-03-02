package com.example.saes4.ui.prestataire

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PrestataireViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Prestataire Fragment"
    }
    val text: LiveData<String> = _text
}