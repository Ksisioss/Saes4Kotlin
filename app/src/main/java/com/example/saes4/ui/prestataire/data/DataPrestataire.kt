package com.example.saes4.ui.prestataire.data

import com.example.saes4.R
import com.example.saes4.ui.prestataire.model.Prestataire


class DataPrestataire {
    fun loadPrestataire(): List<Prestataire> {
        return listOf<Prestataire>(
            Prestataire(
                "Julien",
                "Merveaux",
                R.drawable.prestataire_1,
                "La barquette De Fredy",
                "spectacle",
                "les frites comme vous les aimez en douce ou en normal on trouve toujours le bonheur chez fredy",
                "Julien.Merveaux@hotmail.fr",
                "FredyLocal",
                ),
            Prestataire(
                "Lucas",
                "Lehmann",
                R.drawable.prestataire_2,
                "Le stand de Michelle",
                "food",
                "Venez gouter a nos specialitées",
                "Lucas.Lehmann@hotmail.fr",
                "MichelleLocal",
            ),
            Prestataire(
                "Thibault",
                "Lebreuil",
                R.drawable.prestataire_3,
                "La Fondue Métalique",
                "activite",
                "bienvenue a la fondu metalique pour fondre du metal",
                "Thibault.Lebreuil@hotmail.fr",
                "FonduLocal",
            ),
            Prestataire(
                "George",
                "Nelkson",
                R.drawable.prestataire_4,
                "Le regime Des Vichy",
                "food",
                "Bien le bonjour au stand des carottes vichy",
                "George.Nelkson@hotmail.fr",
                "VichyLocal"
            ),
        )
    }

    fun getPrestataireActivite(): List<Prestataire> {
        val prestataires = loadPrestataire()
        return prestataires.filter { it.category == "activite" }
    }

    fun getPrestataireFood(): List<Prestataire> {
        val prestataires = loadPrestataire()
        return prestataires.filter { it.category == "food" }
    }

    fun getPrestataireSpectacle(): List<Prestataire> {
        val prestataires = loadPrestataire()
        return prestataires.filter { it.category == "spectacle" }
    }

}
