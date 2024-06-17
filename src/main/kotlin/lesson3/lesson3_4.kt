package lesson3

fun main(){
    var inMove: String = "E2"
    var outMove: String = "E4"
    var numberMove: Int = 1

    println("$inMove:$outMove;$numberMove")

    inMove = "D2"
    outMove = "D3"

    println("$inMove:$outMove;${++numberMove}")
}