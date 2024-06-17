package lesson2

const val HOURS_IN_DAY = 24
const val MINUTS_IN_HOUR = 60
const val SECOUNDS_IN_MINUT = 60

fun main() {
    var hourEndTravel = 0
    var minuteEndTravel = 0
    val minutInTravel = 457

    val hourStartTravel = 9
    val minuteStartTravel = 39
    val secondsInTravel =  (((hourStartTravel* MINUTS_IN_HOUR)+minuteStartTravel )* SECOUNDS_IN_MINUT)+(minutInTravel* SECOUNDS_IN_MINUT)

    hourEndTravel = secondsInTravel/(MINUTS_IN_HOUR* SECOUNDS_IN_MINUT)
    minuteEndTravel = (secondsInTravel%( SECOUNDS_IN_MINUT* MINUTS_IN_HOUR))/ MINUTS_IN_HOUR

    print("$hourEndTravel:$minuteEndTravel")
}