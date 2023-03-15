package com.example.saes4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.saes4.ui.prestataire.data.DataPrestataire
import com.example.saes4.ui.prestataire.model.Prestataire

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [fragment_prestataire_profil.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragment_prestataire_profil : Fragment() {
    private lateinit var prestataire: Prestataire
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        prestataire = DataPrestataire().loadPrestataire()[arguments?.getString("presta")?.toInt()!!]
        println(prestataire.firstname.toString())
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_prestataire_profil, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val textViewNom:TextView = view.findViewById(R.id.nom)
        val textViewcategory: TextView = view.findViewById(R.id.category)
        val textViewEmail: TextView = view.findViewById(R.id.email)
        val textViewnomStand: TextView = view.findViewById(R.id.nomStand)
        val textViewEntreprise: TextView = view.findViewById(R.id.entreprise)
        val textViewDescription: TextView = view.findViewById(R.id.textPrestataire)
        val imageView: ImageView = view.findViewById(R.id.imageView)


        textViewNom.text = prestataire.surname
        textViewcategory.text = prestataire.category
        textViewEmail.text = prestataire.email
        textViewnomStand.text = prestataire.nameStand
        textViewEntreprise.text = prestataire.entreprise
        textViewDescription.text = prestataire.textPrestataire
        imageView.setImageResource(prestataire.image)


    }



    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment fragment_prestataire_profil.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            fragment_prestataire_profil().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}