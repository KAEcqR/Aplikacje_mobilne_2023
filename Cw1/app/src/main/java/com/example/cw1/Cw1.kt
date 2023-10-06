package com.example.cw1

import java.util.Scanner

fun main(){
    println("hello world");
    println(wizytowka("kacperek", "ciapek", 15));
}

fun wizytowka(firstname: String, lastname: String, age: Int=18 ):String{
    return "--------------\nimie: $firstname \nnazwisko: $lastname \nwiek: $age \n--------------";
}

fun test(){
    try {
        print("Podaj imie: ")
        val sc = Scanner(System.`in`);
        val firstname = sc.next()

        print("Podaj nazwisko: ")
        val lastname = sc.next()

        print("Podaj Wiek: ")
        val age = sc.next()
        
    }catch (e:Exception){
        println(e.message)
    }

}

