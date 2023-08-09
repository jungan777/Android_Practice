package com.example.androidapp
lateinit var data3: String

fun main(){
    var use=User("hwang",10)

}

class User(name:String, count:Int){
    init{
        println("$name,$count")
    }
}

