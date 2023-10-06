package com.example.cw1

fun main(){
    println("hello world");
    println(wizytowka("kacperek", "ciapek", 15));
}

fun wizytowka(firstname: String, lastname: String, age: Int=18 ):String{
    return "--------------\nimie: $firstname \nnazwisko: $lastname \nwiek: $age \n--------------";
}
