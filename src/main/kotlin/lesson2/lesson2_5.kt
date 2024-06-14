package lesson2

import kotlin.math.pow

fun main(){
    val initPay = 70_000
    val perecentInYear = 16.7
    val denositePeriod = 20

    var sumFinal: Double = initPay*((1+perecentInYear/100).pow(denositePeriod))

    print(String.format("%.3f", sumFinal))
}
