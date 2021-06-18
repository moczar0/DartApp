package com.example.pksdarts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_atc.*

class Fragment_AtC : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_atc, container, false)
    }
    fun Atc(target : Int, liczba_lotek: Int, ): Int{

        //ustalenie wartości startowych

        atctarget_1.text = "Double 1"
        atctarget_2.text = "Double 2"
        atctarget_3.text = "Double 3"
        var licznik = 0
        var licznik2 = 0
        var j = 1
        var k = 2
        var m = 3

        // inicjacja pętli liczącej rzuty oraz zmieniającej wartości pól tekstowych
        for(i in 2..7){
            atc_1.setOnClickListener() {
                licznik++
                licznik2++
            }
            atc_2.setOnClickListener() {
                licznik++
                licznik2++
            }
            atc_3.setOnClickListener() {
                licznik++
                licznik2++
            }
            atc_nic.setOnClickListener(){
                licznik++
            }
            if(licznik2 %3 == 0){
                j =+3
                k =+3
                m =+3

                atctarget_1.text = "Double $j"
                atctarget_2.text = "Double $k"
                atctarget_3.text = "Double $m"

            }
            if(i == 7){
                atctarget_3.text = "BULL"
            }
        }

    }
}