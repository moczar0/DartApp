package com.example.pksdarts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_jdc.*

class Fragment_jdc:Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_jdc, container, false)
    }

    fun jdcGame (startscore1 : Int, starttarget : Int): Int{

        // ustalone zostają wartości startowe zmiennych

        var startscore1 : Int  = 0
        var starttarget : Int = 10
        jdc_score.text = startscore1.toString()
        jdc_target.text = starttarget.toString()
        var i = 0

        //rozpoczyna się pierwszy etap gry kiedy to gracz rzuca po trzy lotki w pola od 10 do 15 kolejno

        for (i in 10..15){
            jdc_single.setOnClickListener{
                jdc_licznik1.text.toInt() = jdc_licznik1.text.toInt() + 1
                startscore1 = startscore1.toInt() + i
            }
            jdc_double.setOnClickListener{
                jdc_licznik2.text.toInt() = jdc_licznik2.text.toInt() + 1
                startscore1 = startscore1.toInt() + i*2
            }
            jdc_triple.setOnClickListener{
                jdc_licznik3.text.toInt() = jdc_licznik3.text.toInt() + 1
                startscore1 = startscore1.toInt() + i*3
            }
            jdc_miss.setOnClickListener{
                jdc_licznik4.text.toInt() = jdc_licznik4.text.toInt() + 1
            }
            if(jdc_licznik1.text.toInt() == 1 && jdc_licznik2.text.toInt() == 1 && jdc_licznik3.text.toInt()==1){
                startscore1 = startscore1.toInt() + 100}
            }
            if(jdc_licznik1.text.toInt() + jdc_licznik2.text.toInt() + jdc_licznik3.text.toInt() + jdc_licznik4.text.toInt() == 3){
                jdc_licznik1.text = 0.toString()
                jdc_licznik2.text = 0.toString()
                jdc_licznik3.text = 0.toString()
                jdc_licznik4.text = 0.toString()
            }
            jdc_target.text = i.toString()

        // rozpoczyna się drugi etap gry, rzucanie po jednej lotce w pola double o 1 do bulla

            if(i == 15){
                for(j in 1..21){
                    jdc_target.text = j.toString()
                    jdc_hit.setOnClickListener{
                        startscore1 = startscore1.toInt() + 50
                        if(j == 21){  startscore1 = startscore1.toInt() + 100}
                    }
                }

                //przejście do ostatniego etapu, rzucanie po trzy lotki w pola od 15 do 20 kolejno

                for(k in 15..20) {
                    jdc_target.text = k.toString()
                    jdc_single.setOnClickListener {
                        jdc_licznik1.text.toInt() = jdc_licznik1.text.toInt() + 1
                        startscore1 = startscore1.toInt() + k
                    }
                    jdc_double.setOnClickListener {
                        jdc_licznik2.text.toInt() = jdc_licznik2.text.toInt() + 1
                        startscore1 = startscore1.toInt() + k * 2
                    }
                    jdc_triple.setOnClickListener {
                        jdc_licznik3.text.toInt() = jdc_licznik3.text.toInt() + 1
                        startscore1 = startscore1.toInt() + k * 3
                    }
                    jdc_miss.setOnClickListener {
                        jdc_licznik4.text.toInt() = jdc_licznik4.text.toInt() + 1
                    }
                    if (jdc_licznik1.text.toInt() == 1 && jdc_licznik2.text.toInt() == 1 && jdc_licznik3.text.toInt() == 1) {
                        startscore1 = startscore1.toInt() + 100
                    }

                    if (jdc_licznik1.text.toInt() + jdc_licznik2.text.toInt() + jdc_licznik3.text.toInt() + jdc_licznik4.text.toInt() == 3) {
                        jdc_licznik1.text = 0.toString()
                        jdc_licznik2.text = 0.toString()
                        jdc_licznik3.text = 0.toString()
                        jdc_licznik4.text = 0.toString()
                    }
                }

            }

        }
    }

}