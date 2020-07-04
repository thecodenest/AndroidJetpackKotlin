package com.rajendra.androidjetpackkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val frag1 = view.findViewById<Button>(R.id.fragment_one_button)

        frag1.setOnClickListener{

            Navigation.findNavController(view).navigate(R.id.dataBindingFragment)

        }

        return view
    }


}