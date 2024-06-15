package lesson3

const val MAX_COUNT_TABLE = 13

fun main(){
    val reservToday = 13
    val reservTomor = 9

    println("Если ли свободные столики сегодня: ${MAX_COUNT_TABLE > reservToday }\n" +
            "Если ли свободные столики завтра: ${MAX_COUNT_TABLE > reservTomor }")
}