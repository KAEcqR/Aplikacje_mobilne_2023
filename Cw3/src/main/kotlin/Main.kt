import kotlin.random.Random
fun main(){
//    wersja1();
//    tablice();
//    imiona();
    mapy();
}

fun wersja1 (){
    fun repeat(tekst: String, count: Int) {
        for (i in 0 .. count){
            println(tekst + " range");
        }
        for (i in 0 until count){
            println(tekst  + " until i = $i");
        }
        for (i in 0 until  count step 2){
            println(tekst + " i = $i");
        }
        for (i in 0 downTo 1){
            println(" i = $i");
        }
    }
    repeat("kacper", 10)
    fun withWhile(){
        var tempOk = "jest zimno"
        var tempRoom = 10;
        while (tempOk == "jest zimno"){
            tempRoom ++
            if (tempRoom == 20){
                tempOk = "Jest przyjemnie"
            }
            println("temperatura = $tempRoom, odczucie = $tempOk")
        }
    }
    withWhile();
    fun withDoWhile(){
        var losowa = 0;
        var licznik = 0;
        var suma = 0;
        var srednia = 0;
        do {
            losowa = Random.nextInt(0, 20);
            print(losowa.toString() + " ");
            licznik ++;
            suma = suma + losowa;
        }while (losowa != 0);
        srednia = suma / licznik;
        println("\nudalo sie w $licznik prob")
        println("\nsuma liczb to $suma ")
        println("\nsrednia liczb to $srednia")
    }
    withDoWhile();
    fun NWDrek(a: Int, b: Int) {
        if (b == 0){
            println("rek $a")
        }else {
            NWDrek(b, a % b)
        }
    }
    NWDrek(4,13)
    fun NWDiter(a: Int, b: Int) {
        var pierwsza = a
        var druga = b

        while (druga != 0) {
            val zmienna = pierwsza
            pierwsza = druga
            druga = zmienna % druga
        }
        println("iter $pierwsza")
    }
    NWDiter(4,13)
}

fun tablice(){
    val arr1 = arrayOf(3,4,5,6,7,8)
    val arr2 = arrayOf("string1", "string2", "string3")

    fun printArr(array: Array<Int>){
        for(elem in array){
            print(elem.toString()+ " ")
        }
        println("\nrozmiar tablicy to ${array.size}")
    }

    // Konstruktor tablic
    val arr3 =  Array<Int>(12, {4})
    printArr(arr3);
}

fun imiona(){
    fun printList(array: MutableList<String?>){
        print("imiona: ");
        for(elem in array){
            print( elem.toString()+ " ")
        }
        println("\nrozmiar tablicy to ${array.size}")
    }

    val imiona = MutableList<String?>(0){""} ;

    println("Podaj imie, stop zakancza")
    var imie = readLine();
    imiona.add(imie);

    while (imie != "stop"){
        println("Podaj imie")
        imie = readLine();
        imiona.add(imie);
    }
    printList(imiona)
}
fun mapy(){
    val MutableMap = mapOf<String, String>("red" to "czerwony","blue" to "niebieski","green" to "zielony","yellow" to "zolty",)
    MutableMap.forEach { println("${it.key} => ${it.value}")}

    val rk = MutableMap.entries.shuffled().first().key

    println("Jaki to kolor? : " + rk)
    val odpowiedz = readLine();
    if (odpowiedz == MutableMap[rk]){
        println("Gratulacje, masz racje szefie")
    } else {
        println("Cymbale, kolorki cie przerastaja'")
    }
}