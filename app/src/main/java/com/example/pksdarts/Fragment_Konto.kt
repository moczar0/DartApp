package com.example.pksdarts


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import android.view.ViewGroup
import android.widget.Adapter
import androidx.fragment.app.Fragment
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener
import kotlinx.android.synthetic.main.fragment_konto.*


class Fragment_Konto : Fragment(){

    // implementacja FireBase i jej zawartości

    private lateinit var myRef: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
       setContentView(R.layout.fragment_konto)

       val firebase = DataBase.getInstance()
       myRef = firebase.getReference(path:"ArrayData")

       recyclerView.layoutManager = GridLayoutManager(applicationContext)
           //zapis danych
           send_data.setOnClickListener{
           val login = login.text.toString()
           val haslo = haslo.text.toString()
           val firebaseInput = DataBase(login, haslo)
           myRef.child(pathString:"${Date().time}".setValue(firebaseInput)

           )
            //pobieranie danych
               myRef.addValueEventListener(object : ValueEventListener{
                   override fun onCancelled(databaseError: DatabaseError) {

                   }

                   override fun onDataChange(dataSnapshot: DataSnapshot) {
                       listOfItems = ArrayList()
                       for(i:DataSnapshot! in dataSnapshot.children){
                           val newRow:DataBase? = i.getValue(DataBase::class.java)
                           listOfItems.add(newRow!!)
                       }
                       setupAdapter(listOfItems)

                   }
               })
       }

   }

    private fun setupAdapter(arrayData: ArrayList<DataBase>){
        recyclerView.adapter = Adapter(arrayData)
    }
}
