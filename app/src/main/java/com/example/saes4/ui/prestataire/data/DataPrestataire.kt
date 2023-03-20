package com.example.saes4.ui.prestataire.data

import com.example.saes4.R
import com.example.saes4.ui.prestataire.model.Prestataire


class DataPrestataire {
    fun loadPrestataire(): List<Prestataire> {
        return listOf<Prestataire>(
            Prestataire(
                R.string.firstname1,
                R.string.surname1,
                R.drawable.prestataire_1,
                R.string.nameStand1,
                R.string.spectacle,
                R.string.textPrestataire1,
                R.string.email1,
                R.string.entreprise1,
            ),
            Prestataire(
                R.string.firstname2,
                R.string.surname2,
                R.drawable.prestataire_2,
                R.string.nameStand2,
                R.string.spectacle,
                R.string.textPrestataire2,
                R.string.email2,
                R.string.entreprise2,
            ),
            Prestataire(
                R.string.firstname3,
                R.string.surname3,
                R.drawable.prestataire_3,
                R.string.nameStand3,
                R.string.spectacle,
                R.string.textPrestataire3,
                R.string.email3,
                R.string.entreprise3,
            ),
            Prestataire(
                R.string.firstname4,
                R.string.surname4,
                R.drawable.prestataire_4,
                R.string.nameStand4,
                R.string.food,
                R.string.textPrestataire4,
                R.string.email4,
                R.string.entreprise4,
            ),
            Prestataire(
                R.string.firstname5,
                R.string.surname5,
                R.drawable.prestataire_5,
                R.string.nameStand5,
                R.string.food,
                R.string.textPrestataire5,
                R.string.email5,
                R.string.entreprise5,
            ),
            Prestataire(
                R.string.firstname6,
                R.string.surname6,
                R.drawable.prestataire_6,
                R.string.nameStand6,
                R.string.food,
                R.string.textPrestataire6,
                R.string.email6,
                R.string.entreprise6,
            ),
            Prestataire(
                R.string.firstname7,
                R.string.surname7,
                R.drawable.prestataire_7,
                R.string.nameStand7,
                R.string.food,
                R.string.textPrestataire7,
                R.string.email7,
                R.string.entreprise7,
            ),
            Prestataire(
                R.string.firstname8,
                R.string.surname8,
                R.drawable.prestataire_8,
                R.string.nameStand8,
                R.string.activite,
                R.string.textPrestataire8,
                R.string.email8,
                R.string.entreprise8,
            )
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
