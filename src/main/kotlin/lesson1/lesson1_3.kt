package lesson1

fun main() {
    val year: Int = 1961
    var hour: String = "09"
    var minute: String = "07"

    println("Год полета: $year")
    println("Час взлета: $hour")
    println("Минута взлета: $minute")

    hour = "10"
    minute = "55"

    print("Время посадки $hour:$minute")
}