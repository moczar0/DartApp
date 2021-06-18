package com.example.pksdarts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_gra.*
import kotlinx.android.synthetic.main.fragment_gra2_solo.*


class Fragment_gra : Fragment(R.layout.fragment_gra){
    companion object {

    }
    override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
): View? {
    return inflater.inflate(R.layout.fragment_gra, container, false)
    }
    object fragment_gra{


    }
     fun mainGame(startscore : Int, liczba_legow: Int): Int{


        var startscore: Int = 0
         //czytamy jaką liczbę legów chciałby zagrać użytkownik
         var liczba_legow = !legi.text.toInt()
         //sprawdzamy i ustalamy jaką opcję punktową wybrał użytkownik
         if(!box301.isChecked)
             {
                startscore = 301
             }
         else(!box501.isChecked)
            {
                startscore = 501
            }

         //klawiatura
        var liczba  = ""
         klaw0.setOnClickListener(){
             liczba = "0"
             Ile_rzucone.text =+ liczba
         }
         klaw1.setOnClickListener(){
             liczba = "1"
             Ile_rzucone.text =+ liczba
         }
         klaw2.setOnClickListener(){
             liczba = "2"
             Ile_rzucone.text =+ liczba
         }
         klaw3.setOnClickListener(){
             liczba = "3"
             Ile_rzucone.text =+ liczba
         }
         klaw4.setOnClickListener(){
             liczba = "4"
             Ile_rzucone.text =+ liczba
         }
         klaw5.setOnClickListener(){
             liczba = "5"
             Ile_rzucone.text =+ liczba
         }
         klaw6.setOnClickListener(){
             liczba = "6"
             Ile_rzucone.text =+ liczba
         }
         klaw7.setOnClickListener(){
             liczba = "7"
             Ile_rzucone.text =+ liczba
         }
         klaw8.setOnClickListener(){
             liczba = "8"
             Ile_rzucone.text =+ liczba
         }
         klaw9.setOnClickListener(){
             liczba = "9"
             Ile_rzucone.text =+ liczba
         }





         // Ustalane są zmienne przetrzymujące wyniki i dane z bieżącej gry
         var leg_avg : Double = 0.0
         var match_avg : Double = 0.0
         var licznik_leg = 0
         var licznik_mecz = 0
         var suma_leg = 0
         var suma_mecz = 0
         var p = 0
         var prev_score = startscore
         MainScore.text = startscore.toString()

         // gra będzie powtarzana dzięki pętli while której granicą będzie liczba legów podana przez grającego w poprzednim etapie
         while(p <= liczba_legow) {
             while (MainScore.text != 0.ToString()) {

                 game_ok.setOnClickListener() {
                    // średnie i wartości punktowe są odpowiednio uzupełniane po każdym zatwierdzeniu wyniku
                     if (Ile_rzucone.text.toInt() >= 0 && Ile_rzucone.text.toInt() <= 180) {
                         MainScore.text = MainScore.text.toInt() - Ile_rzucone.text.toInt()
                         licznik_leg += 3
                         licznik_mecz += 3
                         suma_leg += Ile_rzucone.text.toInt()
                         suma_mecz += Ile_rzucone.text.toInt()
                         match_avg = suma_mecz.toDouble() / licznik_mecz
                         leg_avg = suma_leg.toDouble() / licznik_leg
                         leg_avgtext.text = leg_avg.toString()
                         match_avgtext.text = match_avgtext.toString()

                         game_cofnij.setOnClickListener {
                             if(true) MainScore.text.toInt() = prev_score
                             else prev_score = MainScore.text.toInt()
                         }

                                     



                     } else {
                         println("błędna wartość")
                     }
                 }

                 if (MainScore.text.toInt() = 0) {
                     leg_avg = 0.0
                     suma_leg = 0
                     licznik_leg = 0
                     match_avgtext.text = "0"
                     println("leg zakończony")
                     break

                     Ile_rzucone.text.toString() = ""
                 }
             }
             //Podpowiedzi które zostaną wyświetlone graczowi na moment w dole ekranu, w momencie
             //kiedy będzie on miał możliwość zakończenia (ma mniej niz 171pkt)

             if (MainScore.text.toInt() = 170) {
                 Toast.makeText(appliationContext, "Zakończenie przez T20 T20 BULL")
             }
             if (MainScore.text.toInt() = 167) {
                 Toast.makeText(appliationContext, "Zakończenie przez T20 T19 BULL")
             }
             if (MainScore.text.toInt() = 164) {
                 Toast.makeText(appliationContext, "Zakończenie przez T20 T18 BULL")
             }
             if (MainScore.text.toInt() = 161) {
                 Toast.makeText(appliationContext, "Zakończenie przez T20 T17 BULL")
             }
             if (MainScore.text.toInt() = 160) {
                 Toast.makeText(appliationContext, "Zakończenie przez T20 T20 D20")
             }
             if (MainScore.text.toInt() = 158) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T20 D19")
             }
             if (MainScore.text.toInt() = 157) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T19 D20")
             }
             if (MainScore.text.toInt() = 156) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T20 D18")
             }
             if (MainScore.text.toInt() = 155) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T19 D19")
             }
             if (MainScore.text.toInt() = 154) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T18 D20")
             }
             if (MainScore.text.toInt() = 153) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T19 D18")
             }
             if (MainScore.text.toInt() = 152) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T20 D16")
             }
             if (MainScore.text.toInt() = 151) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T17 D20")
             }
             if (MainScore.text.toInt() = 150) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T19 T19 D18")
             }
             if (MainScore.text.toInt() = 149) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T19 D16")
             }
             if (MainScore.text.toInt() = 148) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T20 D14")
             }
             if (MainScore.text.toInt() = 147) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T17 D18")
             }
             if (MainScore.text.toInt() = 146) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T18 D16")
             }
             if (MainScore.text.toInt() = 145) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T15 D20")
             }
             if (MainScore.text.toInt() = 144) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T20 D12")
             }
             if (MainScore.text.toInt() = 143) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T17 D16")
             }
             if (MainScore.text.toInt() = 142) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T18 D14")
             }
             if (MainScore.text.toInt() = 141) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T15 D18")
             }
             if (MainScore.text.toInt() = 140) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T20 D10")
             }
             if (MainScore.text.toInt() = 139) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T13 D20")
             }
             if (MainScore.text.toInt() = 138) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T18 D12")
             }
             if (MainScore.text.toInt() = 137) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T19 D10")
             }
             if (MainScore.text.toInt() = 136) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T16 D14")
             }
             if (MainScore.text.toInt() = 135) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T17 D12")
             }
             if (MainScore.text.toInt() = 134) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T16 D14")
             }if (MainScore.text.toInt() = 133) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T17 D8")
             }if (MainScore.text.toInt() = 132) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T20 D6")
             }if (MainScore.text.toInt() = 131) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T17 D10")
             }
             if (MainScore.text.toInt() = 130) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T14 D14")
             }
             if (MainScore.text.toInt() = 129) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T15 D12")
             }
             if (MainScore.text.toInt() = 128) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T12 D16")
             }
             if (MainScore.text.toInt() = 127) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T13 D14")
             }
             if (MainScore.text.toInt() = 126) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T10 D18")
             }
             if (MainScore.text.toInt() = 125) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T11 D14")
             }
             if (MainScore.text.toInt() = 124) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T8 D20")
             }
             if (MainScore.text.toInt() = 123) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T9 D18")
             }
             if (MainScore.text.toInt() = 122) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T10 D16")
             }
             if (MainScore.text.toInt() = 121) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T19 D2")
             }
             if (MainScore.text.toInt() = 120) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 S1 D20")
             }
             if (MainScore.text.toInt() = 119) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 S19 D20")
             }
             if (MainScore.text.toInt() = 118) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 S18 D20")
             }
             if (MainScore.text.toInt() = 117) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 T17 D20")
             }
             if (MainScore.text.toInt() = 116) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 S16 D20")
             }
             if (MainScore.text.toInt() = 115) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 S15 D20")
             }
             if (MainScore.text.toInt() = 114) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 S14 D20")
             }
             if (MainScore.text.toInt() = 113) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 S13 D20")
             }
             if (MainScore.text.toInt() = 112) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 S20 D16")
             }
             if (MainScore.text.toInt() = 111) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 S19 D16")
             }
             if (MainScore.text.toInt() = 110) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 BULL")
             }
             if (MainScore.text.toInt() = 109) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 S17 D16")
             }
             if (MainScore.text.toInt() = 108) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 S16 D16")
             }
             if (MainScore.text.toInt() = 107) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T19 BULL")
             }
             if (MainScore.text.toInt() = 106) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 S14 D16")
             }
             if (MainScore.text.toInt() = 105) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 S13 D16")
             }
             if (MainScore.text.toInt() = 104) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T18 BULL")
             }
             if (MainScore.text.toInt() = 103) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 S13 D16")
             }
             if (MainScore.text.toInt() = 102) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 S12 D16")
             }
             if (MainScore.text.toInt() = 101) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T17 BULL")
             }
             if (MainScore.text.toInt() = 100) {
                 Toast.makeText(appliationContext, "Proponowane zakończenie przez T20 D20")
             }

            p++
         }
    }

}



}
