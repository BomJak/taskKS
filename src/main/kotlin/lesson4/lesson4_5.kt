package lesson4

const val NEEDFUL_FOOD = 50
const val MIN_CREW_WHOLE_SHIP = 55
const val MAX_CREW_WHOLE_SHIP = 70
const val NEED_CREW_BROKEN_SHIP = 70


fun main() {
    print("Корабыль без поврежденний? (true/false): ")
    val shipWhole: Boolean = readLine().toBoolean()

    print("Введите количество экипажа: ")
    val shipCrew: Int = readln().toInt()

    print("Введите количество провизии: ")
    val shipFood = readln().toInt()

    print("Благоприятные метеоусловия? (true/false): ")
    val meteoDate: Boolean = readln().toBoolean()

    println(
        "Корабыль может отправиться в плавание: " +
                "${
                    ((shipWhole == true) && 
                            (shipCrew in MIN_CREW_WHOLE_SHIP..MAX_CREW_WHOLE_SHIP) &&
                            (shipFood > NEEDFUL_FOOD)) &&
                            ((shipWhole == false) &&
                                    (shipCrew == NEED_CREW_BROKEN_SHIP) &&
                                    (meteoDate == true) &&
                                    (shipFood > NEEDFUL_FOOD))
                }"
    )
}