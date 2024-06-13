package lesson2

fun main() {
    var hourEndTravel = 0
    var minuteEndTravel = 0
    val fullMinutesInTravel = 457

    val hourStartTravel = 9
    val minuteStartTravel = 39

    val hourInTravel = fullMinutesInTravel / 60
    val minutesInTravel = fullMinutesInTravel % 60

    if ((minuteStartTravel + minutesInTravel) >= 60) {
        hourEndTravel += 1
        minuteEndTravel = minuteStartTravel + minutesInTravel - 60
    } else {
        minuteEndTravel = minuteStartTravel + minutesInTravel
    }

    if ((hourInTravel + hourStartTravel) >= 24) {
        hourEndTravel += hourInTravel + hourStartTravel - 24
    } else{
        hourEndTravel += hourInTravel + hourStartTravel
    }

    print("$hourEndTravel:$minuteEndTravel")
}