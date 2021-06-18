package com.example.pksdarts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_menu.*

class Fragment_menu : Fragment(R.layout.fragment_menu){



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_menu, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonToGra.setOnClickListener {
            findNavController().navigate(Fragment_menuDirections.actionFragment_menuToFragment_gra())

        }
        buttonToJdc.setOnClickListener{
            findNavController().navigate(Fragment_menuDirections.actionFragment_menuToFragment_jdc())
        }
        buttonToAtc.setOnClickListener{
            findNavController().navigate(Fragment_menuDirections.actionFragment_menuToFragment_atc())
        }
        ButtonToKonto.setOnClickListener{
            findNavController().navigate(Fragment_menuDirections.actionFragment_menuToFragment_Konto())
        }
        ButtonToOnline.setOnClickListener{
            findNavController().navigate(Fragment_menuDirections.actionFragment_menuToFragment_Online())
        }
    }


}