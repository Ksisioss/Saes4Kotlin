package com.example.saes4.ui.prestataire.data

import com.example.saes4.R
import com.example.saes4.ui.prestataire.model.Prestataire


class DataPrestataire {

    fun loadPrestataire(): List<Prestataire> {
        return listOf<Prestataire>(
            Prestataire(
                R.string.prenom1,
                R.string.nom1,
                R.drawable.ic_launcher_foreground,
                R.string.nomStand1,
                R.string.categorie1,
                R.string.presentatation1,
            ),
            Prestataire(
                R.string.prenom1,
                R.string.nom1,
                R.drawable.ic_launcher_foreground,
                R.string.nomStand1,
                R.string.categorie1,
                R.string.presentatation1,
            ),
            Prestataire(
                R.string.prenom1,
                R.string.nom1,
                R.drawable.ic_launcher_foreground,
                R.string.nomStand1,
                R.string.categorie1,
                R.string.presentatation1,
            ),
            Prestataire(
                R.string.prenom1,
                R.string.nom1,
                R.drawable.ic_launcher_foreground,
                R.string.nomStand1,
                R.string.categorie1,
                R.string.presentatation1,
            ),
        )
    }
}
