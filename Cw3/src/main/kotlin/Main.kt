import kotlin.random.Random

fun main(){
//    repeat("kacper", 10)
//    withWhile();
    withDoWhile();
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
    do {
        losowa = Random.nextInt(0, 20);
        print(losowa.toString() + " ");
        licznik ++;
    }while (losowa != 0);
    println("\nudalo sie w $licznik prob")
}