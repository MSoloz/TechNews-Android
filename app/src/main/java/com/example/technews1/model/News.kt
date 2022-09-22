package com.example.technews1.model

data class News(

    val text:String,
    val image:String,
    val creator:User,
    val likes:List<User>

)
