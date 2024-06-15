package lesson2

const val HOURS_IN_DAY = 24
const val MINUTS_IN_HOUR = 60
const val SECOUNDS_IN_MINUT = 60

fun main() {
    var hourEndTravel = 0
    var minuteEndTravel = 0
    val fullMinutesInTravel = 457

    val hourStartTravel = 9
    val minuteStartTravel = 39

    val hourInTravel = fullMinutesInTravel / MINUTS_IN_HOUR
    val minutesInTravel = fullMinutesInTravel % SECOUNDS_IN_MINUT

    minuteEndTravel = minuteStartTravel + minutesInTravel
    if ((minuteEndTravel) >= MINUTS_IN_HOUR) {
        hourEndTravel += 1
        minuteEndTravel -= MINUTS_IN_HOUR
    }

    hourEndTravel += hourInTravel + hourStartTravel

    if ((hourEndTravel) >= HOURS_IN_DAY) {
        hourEndTravel += hourEndTravel - HOURS_IN_DAY
    }

    print("$hourEndTravel:$minuteEndTravel")
}