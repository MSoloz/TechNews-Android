package com.example.technews1.model

data class User(

    val name:String,
    val password :String,
    val email: String,
    val image:String,
    val followers: List<User>,
    val followings:List<User>

)
