package com.bemobile.formacionjunit.ui.main

import androidx.lifecycle.ViewModel
import java.util.regex.Pattern

class MainViewModel : ViewModel() {

    fun isEmailValid(possibleEmail: String): Boolean {
        return Pattern.compile(
            "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                    "\\@" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                    ")+"
        ).matcher(possibleEmail).matches()
    }

    fun isPasswordValid(possiblePassword: String): Boolean {
        val regExp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$"
        val pattern = Pattern.compile(regExp)
        val matcher = pattern.matcher(possiblePassword)
        return matcher.matches()
    }
}