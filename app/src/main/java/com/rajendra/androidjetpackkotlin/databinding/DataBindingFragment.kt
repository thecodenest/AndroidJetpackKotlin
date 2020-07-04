package com.rajendra.androidjetpackkotlin.databinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.rajendra.androidjetpackkotlin.R


class DataBindingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       val binding:DataBindingFragmentBinding = DataBindingUtil.inflate(inflater,
           R.layout.data_binding_fragment, container,false);

       // binding.name.text = "Rajendra"
        //binding.email.text = "xyz@gmail.com"
        binding.userData =
            UserData(
                "Raj",
                "abc@gmail.com"
            )

        return binding.root
    }

}