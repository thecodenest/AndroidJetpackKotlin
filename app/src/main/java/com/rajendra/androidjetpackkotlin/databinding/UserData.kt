package com.rajendra.androidjetpackkotlin.databinding

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.rajendra.androidjetpackkotlin.BR

class UserData(name: String, email: String) : BaseObservable() {

    @get:Bindable
    var name: String = name
        set(value) {
            field = value
            notifyPropertyChanged(BR.name)
        }

    @get:Bindable
    var email: String = email
        set(value) {
            field = value
            notifyPropertyChanged(BR.email)
        }

}