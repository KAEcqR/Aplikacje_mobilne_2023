import java.util.*

fun main(args: Array<String>) {
    first("tekst", 5)
}

var i = 0
val sc = Scanner(System.`in`);

fun first(tekst: String, num: Int ){

    println("podaj tekst");
    val tekst = sc.next()
    println("podaj liczbe");
    val Int = sc.next()

    while (i < num){
        println(tekst);
        i++
    }
}
