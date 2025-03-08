package com.example.a060205001901_leanhkhoi_km2301a_btvntuan2.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.a060205001901_leanhkhoi_km2301a_btvntuan2.R

class Listbook : Fragment() {

    private var view: View? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreate(savedInstanceState)
        view = inflater.inflate(R.layout.fragment_list_book, container, false)
        return view
    }
}