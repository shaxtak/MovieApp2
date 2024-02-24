package com.example.movieapp.models

import java.text.SimpleDateFormat
import java.util.Date

class User {
    val name:String? = null
    val author:String? = null
    val about:String? = null
    val date = SimpleDateFormat("dd.MM.yyyy HH:mm").format(Date())
}