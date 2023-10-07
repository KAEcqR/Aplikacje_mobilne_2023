import kotlin.random.Random

fun main(){
//    repeat("kacper", 10)
//    withWhile();
//    withDoWhile();
    NWDrek(4,13)
    NWDiter(4,13)
}

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

fun NWDrek(a: Int, b: Int) {
    if (b == 0){
        println("rek $a")
    }else {
        NWDrek(b, a % b)
    }
}

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