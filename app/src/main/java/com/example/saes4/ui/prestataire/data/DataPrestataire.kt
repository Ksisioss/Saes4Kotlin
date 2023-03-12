package com.example.saes4.ui.prestataire.data

import com.example.saes4.R
import com.example.saes4.ui.prestataire.model.Prestataire


class DataPrestataire {
    fun loadPrestataire(): List<Prestataire> {
        return listOf<Prestataire>(
            Prestataire(
                R.string.julien,
                R.string.merveaux,
                R.drawable.prestataire_1,
                R.string.barquetteDeFredy,
                R.string.spectacle,
                R.string.presentatation1,
            ),
            Prestataire(
                R.string.lucas,
                R.string.lehmann,
                R.drawable.prestataire_2,
                R.string.standMichelle,
                R.string.food,
                R.string.presentatation2,
            ),
            Prestataire(
                R.string.tibault,
                R.string.lebreuil,
                R.drawable.prestataire_3,
                R.string.FondueMetalique,
                R.string.activite,
                R.string.presentatation3,
            ),
            Prestataire(
                R.string.george,
                R.string.nelkson,
                R.drawable.prestataire_4,
                R.string.regimeDesVichy,
                R.string.food,
                R.string.presentatation4,
            ),
        )
    }

    fun getPrestataireActivite(): List<Prestataire> {
        val prestataires = loadPrestataire()
        return prestataires.filter { it.category == R.string.activite }
    }

    fun getPrestataireFood(): List<Prestataire> {
        val prestataires = loadPrestataire()
        return prestataires.filter { it.category == R.string.food }
    }

    fun getPrestataireSpectacle(): List<Prestataire> {
        val prestataires = loadPrestataire()
        return prestataires.filter { it.category == R.string.spectacle }
    }

}
